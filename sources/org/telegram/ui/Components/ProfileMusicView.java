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
    private int backgroundColor;
    private final PorterDuffColorFilter filterColorBlack;
    private final PorterDuffColorFilter filterColorWhite;
    private final Drawable icon;
    private final Paint iconPaint;
    private boolean ignoreRect;
    private float parentExpanded;
    private RenderNode renderNode;
    private float renderNodeScale;
    private float renderNodeTranslateY;
    private final Theme.ResourcesProvider resourcesProvider;
    private final long start;
    private int textColor;
    private Text title;

    public ProfileMusicView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.filterColorWhite = new PorterDuffColorFilter(-1, mode);
        this.filterColorBlack = new PorterDuffColorFilter(-16777216, mode);
        this.iconPaint = new Paint();
        Paint paint = new Paint();
        this.arrowPaint = paint;
        Path path = new Path();
        this.arrowPath = path;
        this.textColor = -1;
        this.ignoreRect = false;
        this.start = System.currentTimeMillis();
        this.resourcesProvider = resourcesProvider;
        this.icon = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
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
        int bgColor2;
        int color;
        if (peerColor == null) {
            color = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
            bgColor2 = color;
        } else {
            int bgColor1 = peerColor.getBgColor1(Theme.isCurrentThemeDark());
            bgColor2 = peerColor.getBgColor2(Theme.isCurrentThemeDark());
            color = bgColor1;
        }
        int iAdaptHSV = Theme.adaptHSV(ColorUtils.blendARGB(color, bgColor2, 0.25f), 0.02f, -0.08f);
        this.backgroundColor = iAdaptHSV;
        setBackgroundColor(iAdaptHSV);
        checkTextColor();
    }

    private void checkTextColor() {
        boolean z = this.parentExpanded < 0.8f && AndroidUtilities.computePerceivedBrightness(this.backgroundColor) > 0.85f;
        this.textColor = z ? -16777216 : -1;
        this.icon.setColorFilter(z ? this.filterColorBlack : this.filterColorWhite);
        this.iconPaint.setColor(this.textColor);
        this.arrowPaint.setColor(Theme.multAlpha(this.textColor, 0.85f));
        invalidate();
    }

    public void setParentExpanded(float f) {
        if (this.parentExpanded != f) {
            this.parentExpanded = f;
            checkTextColor();
            invalidate();
        }
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
        float fDp = AndroidUtilities.dp(16.6f) + this.author.getWidth() + this.title.getWidth() + AndroidUtilities.dp(8.0f);
        canvas.save();
        canvas.translate((getWidth() - fDp) / 2.0f, 0.0f);
        System.currentTimeMillis();
        float height = getHeight() / 2.0f;
        AndroidUtilities.dp(6.0f);
        AndroidUtilities.dp(2.0f);
        int iDp = AndroidUtilities.dp(14.0f);
        int i = (int) height;
        int i2 = iDp / 2;
        this.icon.setBounds(0, i - i2, iDp, i + i2);
        this.icon.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.author.draw(canvas, 0.0f, height, this.textColor, 1.0f);
        canvas.translate(this.author.getWidth(), 0.0f);
        this.title.draw(canvas, 0.0f, height, this.textColor, 0.85f);
        canvas.translate(this.title.getWidth(), 0.0f);
        this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.16f));
        canvas.translate(AndroidUtilities.dpf2(3.8f), height);
        canvas.drawPath(this.arrowPath, this.arrowPaint);
        canvas.restore();
    }
}
