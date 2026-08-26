package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class ProfileMusicView extends View {
    public final Paint arrowPaint;
    public final Path arrowPath;
    public Text author;
    public int backgroundColor;
    public final Paint backgroundPaint;
    public final ButtonBounce bounce;
    public final Path clipPath;
    public float currentHeight;
    public final PorterDuffColorFilter filterColorBlack;
    public final PorterDuffColorFilter filterColorWhite;
    public final Drawable icon;
    public final Paint iconPaint;
    public float parentExpanded;
    public final RectF rect;
    public RenderNode renderNode;
    public float renderNodeScale;
    public float renderNodeTranslateY;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint strokePaint;
    public int textColor;
    public Text title;
    public boolean withShadows;

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
        this.rect = new RectF();
        this.backgroundPaint = new Paint(1);
        this.strokePaint = new Paint(1);
        this.clipPath = new Path();
        this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
        this.textColor = -1;
        this.resourcesProvider = resourcesProvider;
        this.icon = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        this.author = new Text("Author", 11.0f, AndroidUtilities.bold());
        this.title = new Text(" - Title", 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " Author —  - Title");
    }

    public final void checkTextColor() {
        boolean z = this.parentExpanded < 0.8f && AndroidUtilities.computePerceivedBrightness(this.backgroundColor) > 0.85f;
        this.textColor = z ? -16777216 : -1;
        this.icon.setColorFilter(z ? this.filterColorBlack : this.filterColorWhite);
        this.iconPaint.setColor(this.textColor);
        this.arrowPaint.setColor(Theme.multAlpha(0.85f, this.textColor));
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.currentHeight / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.rect;
        ButtonBounce buttonBounce = this.bounce;
        if (action == 0) {
            buttonBounce.setPressed(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && buttonBounce.isPressed) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                buttonBounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3) {
            buttonBounce.setPressed(false);
        } else if (motionEvent.getAction() == 1) {
            if (buttonBounce.isPressed) {
                performClick();
            }
            buttonBounce.setPressed(false);
        }
        return buttonBounce.isPressed;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.author == null || this.title == null) {
            return;
        }
        float fClamp01 = Utilities.clamp01(this.currentHeight / AndroidUtilities.dp(21.0f));
        float scale = this.bounce.getScale(0.02f);
        if (fClamp01 <= 0.0f) {
            return;
        }
        int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
        this.author.ellipsizeWidth = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
        this.title.ellipsizeWidth = (width - this.author.getWidth()) - AndroidUtilities.dp(35.0f);
        float width2 = this.title.getWidth() + this.author.getWidth() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
        float fDp = AndroidUtilities.dp(16.0f) + width2;
        canvas.save();
        canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
        RectF rectF = this.rect;
        rectF.set((getWidth() - fDp) / 2.0f, AndroidUtilities.dp(10.0f), (getWidth() + fDp) / 2.0f, (AndroidUtilities.dp(17.0f) * fClamp01) + AndroidUtilities.dp(10.0f));
        boolean z = this.withShadows;
        Paint paint = this.strokePaint;
        Paint paint2 = this.backgroundPaint;
        if (z && SharedConfig.shadowsInSections) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.multAlpha(fClamp01, 167772160));
            paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, Theme.multAlpha(fClamp01, 201326592));
            paint.setColor(0);
        } else {
            paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * fClamp01));
        if (this.withShadows && SharedConfig.shadowsInSections) {
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        paint2.setAlpha(alpha);
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        if (this.renderNode != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            canvas.save();
            canvas.translate(0.0f, this.renderNodeTranslateY);
            float f = this.renderNodeScale;
            canvas.scale(f, f);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
        canvas.translate((getWidth() - width2) / 2.0f, 0.0f);
        float height = getHeight() / 2.0f;
        AndroidUtilities.dp(6.0f);
        AndroidUtilities.dp(2.0f);
        int iDp = AndroidUtilities.dp(13.0f);
        int i = (int) height;
        int i2 = iDp / 2;
        int i3 = i - i2;
        int i4 = i + i2;
        Drawable drawable = this.icon;
        drawable.setBounds(0, i3, iDp, i4);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.author.draw(0.0f, height, fClamp01, this.textColor, canvas);
        canvas.translate(this.author.getWidth(), 0.0f);
        this.title.draw(0.0f, height, fClamp01 * 0.85f, this.textColor, canvas);
        canvas.translate(this.title.getWidth(), 0.0f);
        Paint paint3 = this.arrowPaint;
        paint3.setStrokeWidth(AndroidUtilities.dpf2(1.16f));
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.arrowPath, paint3);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824));
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        int bgColor1;
        int bgColor2;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (peerColor == null) {
            bgColor1 = Theme.getColor(Theme.key_actionBarDefault, resourcesProvider);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(Theme.currentTheme.isDark());
            bgColor2 = peerColor.getBgColor2(Theme.currentTheme.isDark());
        }
        if (peerColor == null) {
            this.backgroundColor = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
            this.withShadows = true;
        } else {
            this.backgroundColor = Theme.adaptHSV(0.04f, -0.09f, ColorUtils.blendARGB(0.15f, bgColor1, bgColor2));
            this.withShadows = false;
        }
        this.backgroundPaint.setColor(this.backgroundColor);
        checkTextColor();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String string;
        String strM;
        int i = 0;
        if (document != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= document.attributes.size()) {
                    string = null;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    string = documentAttribute.performer;
                    break;
                }
                i2++;
            }
        } else {
            string = null;
            break;
        }
        if (document != null) {
            while (true) {
                if (i >= document.attributes.size()) {
                    strM = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(strM)) {
                        break;
                    }
                    strM = null;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i);
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                    strM = documentAttribute2.title;
                    if (strM != null && strM.length() != 0) {
                        break;
                    }
                    strM = FileLoader.getDocumentFileName(document);
                    break;
                }
                i++;
            }
        } else {
            strM = null;
            break;
        }
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(strM)) {
                string = LocaleController.getString(R.string.AudioUnknownArtist);
                strM = NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder(" - "), R.string.AudioUnknownTitle);
            } else {
                string = "";
            }
        } else if (TextUtils.isEmpty(strM)) {
            strM = "";
        } else {
            strM = " - " + ((Object) strM);
        }
        this.author = new Text(string, 11.0f, AndroidUtilities.bold());
        this.title = new Text(strM, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) string) + " — " + ((Object) strM));
    }

    public void setParentExpanded(float f) {
        if (this.parentExpanded != f) {
            this.parentExpanded = f;
            checkTextColor();
            invalidate();
        }
    }
}
