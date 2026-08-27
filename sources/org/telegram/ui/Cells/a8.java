package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

public class a8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xf.c {
    public static final AccelerateInterpolator J = new AccelerateInterpolator(0.5f);
    public final int A;
    public final boolean B;
    public boolean C;
    public final float D;
    public boolean E;
    public final ImageView F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.c6 I;

    public final z7 f24069a;

    public final ag.k2 f24070b;

    public TLRPC.Document f24071c;
    public SendMessagesHelper.ImportingSticker d;

    public Object f24072e;

    public String f24073f;
    public final TextView h;

    public float f24074n;

    public boolean f24075r;

    public long f24076s;
    public boolean v;

    public float f24077w;

    public long f24078x;

    public boolean f24079y;

    public a8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f24074n = 1.0f;
        this.A = UserConfig.selectedAccount;
        this.D = 1.0f;
        this.I = c6Var;
        this.B = z10;
        z7 z7Var = new z7(this, c6Var);
        this.f24069a = z7Var;
        z7Var.setAspectFit(true);
        z7Var.setAllowLoadingOnAttachedOnly(true);
        z7Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        ag.k2 k2Var = new ag.k2(context, 1, null);
        this.f24070b = k2Var;
        k2Var.setImageReceiver(z7Var);
        k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k2Var.setImageReceiver(z7Var);
        addView(k2Var, h7.z5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, c6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, h7.z5.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.F;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(er.f28122f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        float f10;
        boolean z10;
        boolean z11 = this.f24075r;
        float f11 = this.D;
        z7 z7Var = this.f24069a;
        if (z11 || (((z10 = this.v) && this.f24077w != 0.8f) || (!z10 && this.f24077w != 1.0f))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f24076s;
            this.f24076s = jCurrentTimeMillis;
            if (this.f24075r) {
                long j11 = this.f24078x + j10;
                this.f24078x = j11;
                if (j11 > 1050) {
                    this.f24078x = 1050L;
                }
                float interpolation = (J.getInterpolation(this.f24078x / 150.0f) * 0.5f) + 0.5f;
                this.f24074n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f24075r = false;
                    this.f24074n = 1.0f;
                }
                z7Var.setAlpha(this.f24074n * f11);
            } else if (this.v) {
                float f12 = this.f24077w;
                if (f12 != 0.8f) {
                    float f13 = f12 - (j10 / 400.0f);
                    this.f24077w = f13;
                    if (f13 < 0.8f) {
                        this.f24077w = 0.8f;
                    }
                } else {
                    f10 = (j10 / 400.0f) + this.f24077w;
                    this.f24077w = f10;
                    if (f10 > 1.0f) {
                        this.f24077w = 1.0f;
                    }
                }
            } else {
                f10 = (j10 / 400.0f) + this.f24077w;
                this.f24077w = f10;
                if (f10 > 1.0f) {
                    this.f24077w = 1.0f;
                }
            }
            view.invalidate();
        }
        int iMin = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = iMin;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        z7Var.setImageCoords(measuredWidth - f15, measuredHeight - f15, f14, f14);
        z7Var.setAlpha(this.f24074n * f11);
        if (this.f24077w == 1.0f) {
            z7Var.draw(canvas);
            return;
        }
        canvas.save();
        float f16 = this.f24077w;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        z7Var.draw(canvas);
        canvas.restore();
    }

    public final void c(boolean z10) {
        ImageView imageView = this.F;
        if (!z10) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(er.f28122f).start();
        }
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        TextView textView;
        int i10;
        this.f24073f = str;
        this.C = MessageObject.isPremiumSticker(document);
        this.H = false;
        z7 z7Var = this.f24069a;
        z7Var.setColorFilter(null);
        this.G = 0;
        this.F.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false)));
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.C) {
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
            ag.k2 k2Var = this.f24070b;
            k2Var.setColor(iW0);
            k2Var.D = true;
            k2Var.E = false;
            k2Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                textView = textView2;
                i10 = 4;
                z12 = true;
                z7Var.setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.g6.f23143i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                textView = textView2;
                i10 = 4;
                z12 = true;
                z7Var.setImage(null, null, null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.g6.f23143i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i10);
            }
        } else {
            z12 = true;
            if (document != null) {
                this.f24071c = document;
                this.f24072e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z13 = this.B;
                int i11 = z13 ? org.telegram.ui.ActionBar.g6.f23037c7 : org.telegram.ui.ActionBar.g6.f22999a7;
                float f10 = z13 ? 0.2f : 1.0f;
                org.telegram.ui.ActionBar.c6 c6Var = this.I;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i11, f10, 1.0f, c6Var);
                String str2 = z13 ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(document)) {
                    z7Var.setColorFilter(org.telegram.ui.ActionBar.g6.n0(c6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z13) {
                        this.H = true;
                    }
                    if (svgThumb != null) {
                        z7Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.f24072e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        z7Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.f24072e, 1);
                    } else {
                        z7Var.setImage(ImageLocation.getForDocument(document), str2, null, null, this.f24072e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        z7Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, svgThumb, "webp", this.f24072e, 1);
                    } else {
                        z7Var.setImage(ImageLocation.getForDocument(document), str2, svgThumb, "webp", this.f24072e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    z7Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, null, "webp", this.f24072e, 1);
                } else {
                    z7Var.setImage(ImageLocation.getForDocument(document), str2, null, "webp", this.f24072e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z10) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < document.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                String str3 = documentAttribute.alt;
                                if (str3 != null && str3.length() > 0) {
                                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                                    break;
                                }
                                break;
                            }
                            i12++;
                        }
                        textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.A).getEmojiForSticker(this.f24071c.f22386id), textView2.getPaint().getFontMetricsInt(), false));
                        break;
                    }
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        z7Var.setAlpha(this.f24074n * this.D);
        if (!this.H) {
            z7Var.setParentView(this);
        } else {
            z7Var.setInvalidateAll(z12);
            z7Var.setParentView((View) getParent());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.H) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.C) {
            this.E = true;
        } else {
            this.E = false;
        }
        ag.k2 k2Var = this.f24070b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var.getLayoutParams();
        int i10 = this.A;
        if (UserConfig.getInstance(i10).isPremium()) {
            int iDp = AndroidUtilities.dp(16.0f);
            layoutParams.width = iDp;
            layoutParams.height = iDp;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            k2Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        } else {
            int iDp2 = AndroidUtilities.dp(24.0f);
            layoutParams.width = iDp2;
            layoutParams.height = iDp2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        k2Var.setLocked(!UserConfig.getInstance(i10).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(k2Var, this.E, 0.9f, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f24073f;
    }

    public ImageReceiver getImageView() {
        return this.f24069a;
    }

    public Object getParentObject() {
        return this.f24072e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        z7 z7Var = this.f24069a;
        if (!z7Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f19620x = z7Var.getCenterX() + iArr[0];
        sendAnimationData.f19621y = z7Var.getCenterY() + iArr[1];
        sendAnimationData.width = z7Var.getImageWidth();
        sendAnimationData.height = z7Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f24071c;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.d;
        if (importingSticker == null || !importingSticker.validated) {
            return null;
        }
        return importingSticker;
    }

    @Override
    public final void invalidate() {
        if (this.H && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.H;
        z7 z7Var = this.f24069a;
        if (z10) {
            z7Var.setInvalidateAll(true);
            z7Var.setParentView((View) getParent());
        } else {
            z7Var.setParentView(this);
        }
        z7Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.A).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24069a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f24071c != null) {
            for (int i10 = 0; i10 < this.f24071c.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.f24071c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str == null || str.length() <= 0) {
                        break;
                        break;
                    }
                    String str2 = documentAttribute.alt;
                    TextView textView = this.h;
                    textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                    string = a9.p.n(documentAttribute.alt, " ", string, new StringBuilder());
                    break;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.f24079y = z10;
    }

    public void setScaled(boolean z10) {
        this.v = z10;
        this.f24076s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        d(null, importingSticker, null, str, str != null, false);
    }
}
