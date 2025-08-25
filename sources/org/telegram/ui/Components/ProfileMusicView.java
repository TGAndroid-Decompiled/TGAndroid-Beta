package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ProfileActivity;

public class ProfileMusicView extends View {
    private final Paint arrowPaint;
    private final Path arrowPath;
    private Text author;
    private ProfileActivity.AvatarImageView avatarView;
    private final Drawable icon;
    private final Paint iconPaint;
    private boolean ignoreRect;
    private RenderNode renderNode;
    private float renderNodeScale;
    private float renderNodeTranslateY;
    private final Theme.ResourcesProvider resourcesProvider;
    private final long start;
    private Text title;

    public ProfileMusicView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint();
        this.iconPaint = paint;
        Paint paint2 = new Paint();
        this.arrowPaint = paint2;
        Path path = new Path();
        this.arrowPath = path;
        this.ignoreRect = false;
        this.start = System.currentTimeMillis();
        this.resourcesProvider = resourcesProvider;
        Drawable mutate = context.getResources().getDrawable(R.drawable.files_music).mutate();
        this.icon = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Theme.multAlpha(-1, 0.85f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        setText("Author", " - Title");
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        int bgColor1;
        int bgColor2;
        if (peerColor == null) {
            if (!Theme.isCurrentThemeDark()) {
                setBackgroundColor(Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider));
                return;
            } else {
                int i = Theme.key_actionBarDefault;
                bgColor1 = Theme.getColor(i, this.resourcesProvider);
                bgColor2 = Theme.getColor(i, this.resourcesProvider);
            }
        } else {
            bgColor1 = peerColor.getBgColor1(Theme.isCurrentThemeDark());
            bgColor2 = peerColor.getBgColor2(Theme.isCurrentThemeDark());
        }
        setBackgroundColor(Theme.adaptHSV(ColorUtils.blendARGB(bgColor1, bgColor2, 0.25f), 0.02f, -0.08f));
    }

    public void setMusicDocument(TLRPC.Document document) {
        CharSequence author = getAuthor(document);
        CharSequence title = getTitle(document);
        if (TextUtils.isEmpty(author)) {
            if (TextUtils.isEmpty(title)) {
                author = LocaleController.getString(R.string.AudioUnknownArtist);
                title = LocaleController.getString(R.string.AudioUnknownTitle);
            } else {
                author = "";
            }
        } else if (TextUtils.isEmpty(title)) {
            title = "";
        } else {
            title = " - " + ((Object) title);
        }
        setText(author, title);
    }

    public static CharSequence getTitle(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                return (str == null || str.length() == 0) ? FileLoader.getDocumentFileName(document) : str;
            }
        }
        String documentFileName = FileLoader.getDocumentFileName(document);
        if (TextUtils.isEmpty(documentFileName)) {
            return null;
        }
        return documentFileName;
    }

    public static CharSequence getAuthor(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                return documentAttribute.performer;
            }
        }
        return null;
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.author = new Text(charSequence, 11.0f, AndroidUtilities.bold());
        this.title = new Text(charSequence2, 11.0f);
    }

    public void drawingBlur(boolean z) {
        if (this.ignoreRect == z && this.renderNode == null) {
            return;
        }
        this.ignoreRect = z;
        this.renderNode = null;
        this.avatarView = null;
        invalidate();
    }

    public void drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarImageView, float f, float f2) {
        this.ignoreRect = false;
        this.renderNode = renderNode;
        this.avatarView = avatarImageView;
        this.renderNodeScale = f;
        this.renderNodeTranslateY = f2;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.author == null || this.title == null) {
            return;
        }
        if (!this.ignoreRect && this.renderNode != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            canvas.save();
            canvas.translate(0.0f, this.renderNodeTranslateY);
            float f = this.renderNodeScale;
            canvas.scale(f, f);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
        int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
        this.author.ellipsize((width - AndroidUtilities.dp(35.0f)) / 2.0f);
        this.title.ellipsize((width - this.author.getWidth()) - AndroidUtilities.dp(35.0f));
        float dp = AndroidUtilities.dp(16.6f) + this.author.getWidth() + this.title.getWidth() + AndroidUtilities.dp(8.0f);
        canvas.save();
        canvas.translate((getWidth() - dp) / 2.0f, 0.0f);
        System.currentTimeMillis();
        float height = getHeight() / 2.0f;
        AndroidUtilities.dp(6.0f);
        AndroidUtilities.dp(2.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int i = (int) height;
        int i2 = dp2 / 2;
        this.icon.setBounds(0, i - i2, dp2, i + i2);
        this.icon.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.author.draw(canvas, 0.0f, height, -1, 1.0f);
        canvas.translate(this.author.getWidth(), 0.0f);
        this.title.draw(canvas, 0.0f, height, -1, 0.85f);
        canvas.translate(this.title.getWidth(), 0.0f);
        this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.16f));
        canvas.translate(AndroidUtilities.dpf2(3.8f), height);
        canvas.drawPath(this.arrowPath, this.arrowPaint);
        canvas.restore();
    }
}
