package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public class i8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, qg.c {
    public static final AccelerateInterpolator N = new AccelerateInterpolator(0.5f);
    public final int E;
    public final boolean F;
    public boolean G;
    public final float H;
    public boolean I;
    public final ImageView J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.u6 M;
    public final h8 f24241a;
    public final tg.c1 f24242b;
    public TLRPC.Document f24243c;
    public SendMessagesHelper.ImportingSticker d;
    public Object e;
    public String f24244f;
    public final TextView h;
    public float f24245n;
    public boolean f24246r;
    public long f24247s;
    public boolean v;
    public float f24248w;
    public long f24249x;
    public boolean f24250y;

    public i8(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f24245n = 1.0f;
        this.E = UserConfig.selectedAccount;
        this.H = 1.0f;
        this.M = u6Var;
        this.F = z10;
        h8 h8Var = new h8(this, u6Var);
        this.f24241a = h8Var;
        h8Var.setAspectFit(true);
        h8Var.setAllowLoadingOnAttachedOnly(true);
        h8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        tg.c1 c1Var = new tg.c1(context, 1, null);
        this.f24242b = c1Var;
        c1Var.setImageReceiver(h8Var);
        c1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c1Var.setImageReceiver(h8Var);
        addView(c1Var, gb1.h(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.y6.q5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i10);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(imageView, c02, N2, null, u6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, gb1.i(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(ds.f27584f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f24246r;
        float f7 = this.H;
        h8 h8Var = this.f24241a;
        if (z11 || (((z10 = this.v) && this.f24248w != 0.8f) || (!z10 && this.f24248w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f24247s;
            this.f24247s = currentTimeMillis;
            if (this.f24246r) {
                long j11 = this.f24249x + j10;
                this.f24249x = j11;
                if (j11 > 1050) {
                    this.f24249x = 1050L;
                }
                float interpolation = (N.getInterpolation(((float) this.f24249x) / 150.0f) * 0.5f) + 0.5f;
                this.f24245n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f24246r = false;
                    this.f24245n = 1.0f;
                }
                h8Var.setAlpha(this.f24245n * f7);
            } else {
                if (this.v) {
                    float f10 = this.f24248w;
                    if (f10 != 0.8f) {
                        float f11 = f10 - (((float) j10) / 400.0f);
                        this.f24248w = f11;
                        if (f11 < 0.8f) {
                            this.f24248w = 0.8f;
                        }
                    }
                }
                float f12 = (((float) j10) / 400.0f) + this.f24248w;
                this.f24248w = f12;
                if (f12 > 1.0f) {
                    this.f24248w = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f13 = min;
        float f14 = f13 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        h8Var.setImageCoords(measuredWidth - f14, measuredHeight - f14, f13, f13);
        h8Var.setAlpha(this.f24245n * f7);
        if (this.f24248w != 1.0f) {
            canvas.save();
            float f15 = this.f24248w;
            canvas.scale(f15, f15, measuredWidth, measuredHeight);
            h8Var.draw(canvas);
            canvas.restore();
            return;
        }
        h8Var.draw(canvas);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(ds.f27584f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        float f7;
        String str2;
        int i11;
        TextView textView;
        String str3;
        String str4;
        this.f24244f = str;
        this.G = MessageObject.isPremiumSticker(document);
        this.L = false;
        h8 h8Var = this.f24241a;
        h8Var.setColorFilter(null);
        this.K = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i12 = org.telegram.ui.ActionBar.y6.q5;
        org.telegram.ui.ActionBar.f7.C(this.J, org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i12, false)), org.telegram.ui.ActionBar.f7.N(i12), null);
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.G) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
            tg.c1 c1Var = this.f24242b;
            c1Var.setColor(x02);
            c1Var.H = true;
            c1Var.I = false;
            c1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                ImageLocation forPath = ImageLocation.getForPath(importingSticker.path);
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.y6.f23445i5, 1.0f);
                if (importingSticker.animated) {
                    str4 = "tgs";
                } else {
                    str4 = null;
                }
                i11 = 4;
                z12 = true;
                textView = textView2;
                h8Var.setImage(forPath, "80_80", null, null, svgRectThumb, 0L, str4, 0, 1);
            } else {
                i11 = 4;
                textView = textView2;
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.y6.f23445i5, 1.0f);
                if (importingSticker.animated) {
                    str3 = "tgs";
                } else {
                    str3 = null;
                }
                z12 = true;
                h8Var.setImage(null, null, null, null, svgRectThumb2, 0L, str3, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i11);
            }
        } else {
            z12 = true;
            if (document != null) {
                this.f24243c = document;
                this.e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z13 = this.F;
                if (z13) {
                    i10 = org.telegram.ui.ActionBar.y6.f23336c7;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23297a7;
                }
                if (z13) {
                    f7 = 0.2f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.ActionBar.u6 u6Var = this.M;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i10, f7, 1.0f, u6Var);
                if (z13) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    h8Var.setColorFilter(org.telegram.ui.ActionBar.y6.o0(u6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z13) {
                        this.L = true;
                    }
                    if (svgThumb != null) {
                        h8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        h8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        h8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        h8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.e, 1);
                    } else {
                        h8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    h8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.e, 1);
                } else {
                    h8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z10) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str6 = documentAttribute.alt;
                            if (str6 != null && str6.length() > 0) {
                                textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        } else {
                            i13++;
                        }
                    }
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.E).getEmojiForSticker(this.f24243c.f22033id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        h8Var.setAlpha(this.f24245n * this.H);
        if (this.L) {
            h8Var.setInvalidateAll(z12);
            h8Var.setParentView((View) getParent());
            return;
        }
        h8Var.setParentView(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.L) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        tg.c1 c1Var = this.f24242b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1Var.getLayoutParams();
        int i10 = this.E;
        if (!UserConfig.getInstance(i10).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            c1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            c1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        c1Var.setLocked(!UserConfig.getInstance(i10).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(c1Var, this.I, 0.9f, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f24244f;
    }

    public ImageReceiver getImageView() {
        return this.f24241a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        h8 h8Var = this.f24241a;
        if (!h8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f19547x = h8Var.getCenterX() + iArr[0];
        sendAnimationData.f19548y = h8Var.getCenterY() + iArr[1];
        sendAnimationData.width = h8Var.getImageWidth();
        sendAnimationData.height = h8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f24243c;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.d;
        if (importingSticker != null && importingSticker.validated) {
            return importingSticker;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (this.L && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.L;
        h8 h8Var = this.f24241a;
        if (z10) {
            h8Var.setInvalidateAll(true);
            h8Var.setParentView((View) getParent());
        } else {
            h8Var.setParentView(this);
        }
        h8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.E).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24241a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f24243c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f24243c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f24243c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = a1.g.q(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.f24250y = z10;
    }

    public void setScaled(boolean z10) {
        this.v = z10;
        this.f24247s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        boolean z10;
        String str = importingSticker.emoji;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, importingSticker, null, str, z10, false);
    }
}
