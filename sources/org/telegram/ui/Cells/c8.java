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
import org.telegram.ui.Components.mr;
public class c8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, bg.d {
    public static final AccelerateInterpolator K = new AccelerateInterpolator(0.5f);
    public final int B;
    public final boolean C;
    public boolean D;
    public final float E;
    public boolean F;
    public final ImageView G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final b8 f20883a;
    public final eg.s1 f20884b;
    public TLRPC.Document f20885c;
    public SendMessagesHelper.ImportingSticker d;
    public Object e;
    public String f20886f;
    public final TextView h;
    public float f20887n;
    public boolean f20888r;
    public long f20889s;
    public boolean v;
    public float f20890w;
    public long f20891x;
    public boolean f20892y;

    public c8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.f20887n = 1.0f;
        this.B = UserConfig.selectedAccount;
        this.E = 1.0f;
        this.J = f6Var;
        this.C = z4;
        b8 b8Var = new b8(this, f6Var);
        this.f20883a = b8Var;
        b8Var.setAspectFit(true);
        b8Var.setAllowLoadingOnAttachedOnly(true);
        b8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        eg.s1 s1Var = new eg.s1(context, 1, null);
        this.f20884b = s1Var;
        s1Var.setImageReceiver(b8Var);
        s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        s1Var.setImageReceiver(b8Var);
        addView(s1Var, k7.b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20114q5, f6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, k7.b6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(mr.f27122f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z4;
        boolean z10 = this.f20888r;
        float f10 = this.E;
        b8 b8Var = this.f20883a;
        if (z10 || (((z4 = this.v) && this.f20890w != 0.8f) || (!z4 && this.f20890w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f20889s;
            this.f20889s = currentTimeMillis;
            if (this.f20888r) {
                long j11 = this.f20891x + j10;
                this.f20891x = j11;
                if (j11 > 1050) {
                    this.f20891x = 1050L;
                }
                float interpolation = (K.getInterpolation(((float) this.f20891x) / 150.0f) * 0.5f) + 0.5f;
                this.f20887n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f20888r = false;
                    this.f20887n = 1.0f;
                }
                b8Var.setAlpha(this.f20887n * f10);
            } else {
                if (this.v) {
                    float f11 = this.f20890w;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j10) / 400.0f);
                        this.f20890w = f12;
                        if (f12 < 0.8f) {
                            this.f20890w = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j10) / 400.0f) + this.f20890w;
                this.f20890w = f13;
                if (f13 > 1.0f) {
                    this.f20890w = 1.0f;
                }
            }
            view.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        b8Var.setImageCoords(measuredWidth - f15, measuredHeight - f15, f14, f14);
        b8Var.setAlpha(this.f20887n * f10);
        if (this.f20890w != 1.0f) {
            canvas.save();
            float f16 = this.f20890w;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            b8Var.draw(canvas);
            canvas.restore();
            return;
        }
        b8Var.draw(canvas);
    }

    public final void c(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(mr.f27122f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z4, boolean z10) {
        boolean z11;
        int i10;
        float f10;
        String str2;
        TextView textView;
        int i11;
        String str3;
        String str4;
        this.f20886f = str;
        this.D = MessageObject.isPremiumSticker(document);
        this.I = false;
        b8 b8Var = this.f20883a;
        b8Var.setColorFilter(null);
        this.H = 0;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20114q5, false)));
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
            eg.s1 s1Var = this.f20884b;
            s1Var.setColor(w02);
            s1Var.E = true;
            s1Var.F = false;
            s1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                ImageLocation forPath = ImageLocation.getForPath(importingSticker.path);
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.f19970i5, 1.0f);
                if (importingSticker.animated) {
                    str4 = "tgs";
                } else {
                    str4 = null;
                }
                textView = textView2;
                i11 = 4;
                z11 = true;
                b8Var.setImage(forPath, "80_80", null, null, svgRectThumb, 0L, str4, 0, 1);
            } else {
                textView = textView2;
                i11 = 4;
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.f19970i5, 1.0f);
                if (importingSticker.animated) {
                    str3 = "tgs";
                } else {
                    str3 = null;
                }
                z11 = true;
                b8Var.setImage(null, null, null, null, svgRectThumb2, 0L, str3, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i11);
            }
        } else {
            z11 = true;
            if (document != null) {
                this.f20885c = document;
                this.e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z12 = this.C;
                if (z12) {
                    i10 = org.telegram.ui.ActionBar.j6.f19864c7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19827a7;
                }
                if (z12) {
                    f10 = 0.2f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.J;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i10, f10, 1.0f, f6Var);
                if (z12) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    b8Var.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z12) {
                        this.I = true;
                    }
                    if (svgThumb != null) {
                        b8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        b8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        b8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        b8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.e, 1);
                    } else {
                        b8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    b8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.e, 1);
                } else {
                    b8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z4) {
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
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.B).getEmojiForSticker(this.f20885c.f19165id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        b8Var.setAlpha(this.f20887n * this.E);
        if (this.I) {
            b8Var.setInvalidateAll(z11);
            b8Var.setParentView((View) getParent());
            return;
        }
        b8Var.setParentView(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.I) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4) {
        if (this.D) {
            this.F = true;
        } else {
            this.F = false;
        }
        eg.s1 s1Var = this.f20884b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s1Var.getLayoutParams();
        int i10 = this.B;
        if (!UserConfig.getInstance(i10).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        s1Var.setLocked(!UserConfig.getInstance(i10).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(s1Var, this.F, 0.9f, z4);
        invalidate();
    }

    public String getEmoji() {
        return this.f20886f;
    }

    public ImageReceiver getImageView() {
        return this.f20883a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        b8 b8Var = this.f20883a;
        if (!b8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f16647x = b8Var.getCenterX() + iArr[0];
        sendAnimationData.f16648y = b8Var.getCenterY() + iArr[1];
        sendAnimationData.width = b8Var.getImageWidth();
        sendAnimationData.height = b8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f20885c;
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
        if (this.I && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z4 = this.I;
        b8 b8Var = this.f20883a;
        if (z4) {
            b8Var.setInvalidateAll(true);
            b8Var.setParentView((View) getParent());
        } else {
            b8Var.setParentView(this);
        }
        b8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.B).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20883a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f20885c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f20885c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f20885c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = android.support.v4.media.a.p(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z4) {
        this.f20892y = z4;
    }

    public void setScaled(boolean z4) {
        this.v = z4;
        this.f20889s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        boolean z4;
        String str = importingSticker.emoji;
        if (str != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        d(null, importingSticker, null, str, z4, false);
    }
}
