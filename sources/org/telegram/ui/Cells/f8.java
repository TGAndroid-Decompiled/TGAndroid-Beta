package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.ui.Components.hs;
public class f8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, og.c {
    public static final AccelerateInterpolator N = new AccelerateInterpolator(0.5f);
    public final int E;
    public final boolean F;
    public boolean G;
    public final float H;
    public boolean I;
    public final ImageView J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.e6 M;
    public final e8 f22088a;
    public final rg.c1 f22089b;
    public TLRPC.Document f22090c;
    public SendMessagesHelper.ImportingSticker d;
    public Object f22091e;
    public String f22092f;
    public final TextView h;
    public float f22093n;
    public boolean f22094r;
    public long f22095s;
    public boolean v;
    public float f22096w;
    public long f22097x;
    public boolean f22098y;

    public f8(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f22093n = 1.0f;
        this.E = UserConfig.selectedAccount;
        this.H = 1.0f;
        this.M = e6Var;
        this.F = z10;
        e8 e8Var = new e8(this, e6Var);
        this.f22088a = e8Var;
        e8Var.setAspectFit(true);
        e8Var.setAllowLoadingOnAttachedOnly(true);
        e8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        rg.c1 c1Var = new rg.c1(context, 1, null);
        this.f22089b = c1Var;
        c1Var.setImageReceiver(e8Var);
        c1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c1Var.setImageReceiver(e8Var);
        addView(c1Var, w7.x5.a(24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24, 81));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21036q5, e6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, w7.x5.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(hs.f27118f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f22094r;
        float f7 = this.H;
        e8 e8Var = this.f22088a;
        if (z11 || (((z10 = this.v) && this.f22096w != 0.8f) || (!z10 && this.f22096w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f22095s;
            this.f22095s = currentTimeMillis;
            if (this.f22094r) {
                long j10 = this.f22097x + j3;
                this.f22097x = j10;
                if (j10 > 1050) {
                    this.f22097x = 1050L;
                }
                float interpolation = (N.getInterpolation(((float) this.f22097x) / 150.0f) * 0.5f) + 0.5f;
                this.f22093n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f22094r = false;
                    this.f22093n = 1.0f;
                }
                e8Var.setAlpha(this.f22093n * f7);
            } else {
                if (this.v) {
                    float f10 = this.f22096w;
                    if (f10 != 0.8f) {
                        float f11 = f10 - (((float) j3) / 400.0f);
                        this.f22096w = f11;
                        if (f11 < 0.8f) {
                            this.f22096w = 0.8f;
                        }
                    }
                }
                float f12 = (((float) j3) / 400.0f) + this.f22096w;
                this.f22096w = f12;
                if (f12 > 1.0f) {
                    this.f22096w = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f13 = min;
        float f14 = f13 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        e8Var.setImageCoords(measuredWidth - f14, measuredHeight - f14, f13, f13);
        e8Var.setAlpha(this.f22093n * f7);
        if (this.f22096w != 1.0f) {
            canvas.save();
            float f15 = this.f22096w;
            canvas.scale(f15, f15, measuredWidth, measuredHeight);
            e8Var.draw(canvas);
            canvas.restore();
            return;
        }
        e8Var.draw(canvas);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(hs.f27118f).start();
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
        this.f22092f = str;
        this.G = MessageObject.isPremiumSticker(document);
        this.L = false;
        e8 e8Var = this.f22088a;
        e8Var.setColorFilter(null);
        this.K = 0;
        this.J.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false)));
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.G) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false);
            rg.c1 c1Var = this.f22089b;
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
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.i6.f20887i5, 1.0f);
                if (importingSticker.animated) {
                    str4 = "tgs";
                } else {
                    str4 = null;
                }
                i11 = 4;
                z12 = true;
                textView = textView2;
                e8Var.setImage(forPath, "80_80", null, null, svgRectThumb, 0L, str4, 0, 1);
            } else {
                i11 = 4;
                textView = textView2;
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.i6.f20887i5, 1.0f);
                if (importingSticker.animated) {
                    str3 = "tgs";
                } else {
                    str3 = null;
                }
                z12 = true;
                e8Var.setImage(null, null, null, null, svgRectThumb2, 0L, str3, 0, 1);
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
                this.f22090c = document;
                this.f22091e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z13 = this.F;
                if (z13) {
                    i10 = org.telegram.ui.ActionBar.i6.f20781c7;
                } else {
                    i10 = org.telegram.ui.ActionBar.i6.f20741a7;
                }
                if (z13) {
                    f7 = 0.2f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.M;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i10, f7, 1.0f, e6Var);
                if (z13) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    e8Var.setColorFilter(org.telegram.ui.ActionBar.i6.o0(e6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z13) {
                        this.L = true;
                    }
                    if (svgThumb != null) {
                        e8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.f22091e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        e8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.f22091e, 1);
                    } else {
                        e8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.f22091e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        e8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.f22091e, 1);
                    } else {
                        e8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.f22091e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    e8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.f22091e, 1);
                } else {
                    e8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.f22091e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z10) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str6 = documentAttribute.alt;
                            if (str6 != null && str6.length() > 0) {
                                textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        } else {
                            i12++;
                        }
                    }
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.E).getEmojiForSticker(this.f22090c.f20044id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        e8Var.setAlpha(this.f22093n * this.H);
        if (this.L) {
            e8Var.setInvalidateAll(z12);
            e8Var.setParentView((View) getParent());
            return;
        }
        e8Var.setParentView(this);
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
        rg.c1 c1Var = this.f22089b;
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
        return this.f22092f;
    }

    public ImageReceiver getImageView() {
        return this.f22088a;
    }

    public Object getParentObject() {
        return this.f22091e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        e8 e8Var = this.f22088a;
        if (!e8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f17250x = e8Var.getCenterX() + iArr[0];
        sendAnimationData.f17251y = e8Var.getCenterY() + iArr[1];
        sendAnimationData.width = e8Var.getImageWidth();
        sendAnimationData.height = e8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f22090c;
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
        e8 e8Var = this.f22088a;
        if (z10) {
            e8Var.setInvalidateAll(true);
            e8Var.setParentView((View) getParent());
        } else {
            e8Var.setParentView(this);
        }
        e8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.E).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22088a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f22090c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f22090c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f22090c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = a1.g.r(documentAttribute.alt, " ", string, new StringBuilder());
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
        this.f22098y = z10;
    }

    public void setScaled(boolean z10) {
        this.v = z10;
        this.f22095s = System.currentTimeMillis();
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
