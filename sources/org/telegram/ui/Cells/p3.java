package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii0;
public final class p3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final int f20801a;
    public final TextView f20802b;
    public final TextView f20803c;
    public final org.telegram.ui.Components.w9 d;
    public final ii0 e;
    public final TextView f20804f;
    public final rg.p0 h;
    public AnimatorSet f20805n;
    public TLRPC.StickerSetCovered f20806r;
    public boolean f20807s;
    public boolean v;
    public boolean f20808w;
    public boolean f20809x;
    public Long f20810y;

    public p3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        this.f20801a = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.f20802b = textView;
        ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z10) {
            f7 = 22.0f;
        } else {
            f7 = 71.0f;
        }
        if (z10) {
            f10 = 71.0f;
        } else {
            f10 = 22.0f;
        }
        addView(textView, w7.y5.d(-2, -2.0f, i11, f7, 10.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f20803c = textView2;
        ok.t(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19462z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        if (z11) {
            f11 = 100.0f;
        } else {
            f11 = 71.0f;
        }
        if (z11) {
            f12 = 71.0f;
        } else {
            f12 = 100.0f;
        }
        addView(textView2, w7.y5.d(-2, -2.0f, i13, f11, 35.0f, f12, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        boolean z12 = LocaleController.isRTL;
        int i14 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f13 = 0.0f;
        } else {
            f13 = 12.0f;
        }
        if (z12) {
            f14 = 12.0f;
        } else {
            f14 = 0.0f;
        }
        addView(w9Var, w7.y5.d(48, 48.0f, i14, f13, 8.0f, f14, 0.0f));
        ii0 ii0Var = new ii0(context);
        this.e = ii0Var;
        ii0Var.setText(LocaleController.getString(R.string.Add));
        ii0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        addView(ii0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f20804f = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.f0.q(textView3, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Rh, false), 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(4.0f), context, d6Var, false);
        this.h = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new a(this, 4), false);
        p0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.h, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        ii0 ii0Var2 = this.e;
        ii0Var2.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        ii0Var2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        String str;
        TLRPC.StickerSetCovered stickerSetCovered2;
        boolean z13;
        boolean z14;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        ImageLocation forSticker;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f20805n;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20805n = null;
        }
        this.f20808w = z10;
        this.f20806r = stickerSetCovered;
        setWillNotDraw(!z10);
        String str2 = this.f20806r.set.title;
        TextView textView = this.f20802b;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.f20803c.setText(LocaleController.formatPluralString(str, stickerSet2.count, new Object[0]));
        boolean z15 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.f20801a;
        if (z15 && (stickerSet = stickerSetCovered.set) != null) {
            this.f20810y = Long.valueOf(stickerSet.f18363id);
            if (!this.f20809x) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.f20809x = true;
            }
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i10).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false);
            if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
                document = stickerSet3.documents.get(0);
                int i11 = 0;
                while (true) {
                    if (i11 >= stickerSet3.documents.size()) {
                        break;
                    } else if (stickerSet3.documents.get(i11).f18342id == stickerSetCovered.set.thumb_document_id) {
                        document = stickerSet3.documents.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            TLRPC.Document document2 = stickerSetCovered.cover;
            if (document2 == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                    if (stickerSetCovered.set != null) {
                        for (int i12 = 0; i12 < stickerSetCovered.covers.size(); i12++) {
                            if (stickerSetCovered.covers.get(i12).f18342id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i12);
                            }
                        }
                    }
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                        TLRPC.Document document3 = arrayList2.get(0);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (arrayList2.get(i13).f18342id == stickerSetCovered.set.thumb_document_id) {
                                document2 = arrayList2.get(i13);
                            }
                        }
                        document = document3;
                    }
                }
            }
            document = document2;
            break;
        }
        org.telegram.ui.Components.w9 w9Var = this.d;
        if (document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.h6.f19004a7, 1.0f);
                boolean z16 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                if (z16) {
                    forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
                } else {
                    forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                }
                if (z16 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                    if (svgThumb != null) {
                        w9Var.n(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                    } else {
                        w9Var.j(ImageLocation.getForDocument(document), "50_50", forSticker, null, 0, stickerSetCovered);
                    }
                } else if (forSticker != null && forSticker.imageType == 1) {
                    w9Var.i(forSticker, "50_50", "tgs", svgThumb, stickerSetCovered);
                } else {
                    w9Var.i(forSticker, "50_50", "webp", svgThumb, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    w9Var.i(ImageLocation.getForDocument(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            w9Var.i(null, null, "webp", null, stickerSetCovered2);
        }
        ii0 ii0Var = this.e;
        ii0Var.setVisibility(0);
        this.E = z11;
        if (!z11 && !MediaDataController.getInstance(i10).isStickerPackInstalled(stickerSetCovered2.set.f18363id)) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f20807s = z13;
        if (!UserConfig.getInstance(i10).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.v = z14;
        rg.p0 p0Var = this.h;
        TextView textView2 = this.f20804f;
        if (z12) {
            if (z14) {
                p0Var.setVisibility(0);
                textView2.setVisibility(0);
                ii0Var.setVisibility(0);
            } else {
                p0Var.setVisibility(0);
                if (this.f20807s) {
                    textView2.setVisibility(0);
                } else {
                    ii0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20805n = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f20805n;
            if (this.f20807s && !this.v) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f20807s && !this.v) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr2 = {f10};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f20807s && !this.v) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr3 = {f11};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f20807s && !this.v) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ii0Var, property, f12);
            if (!this.f20807s && !this.v) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ii0Var, property2, f13);
            if (!this.v) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property3, f14);
            if (!this.v) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(p0Var, property2, f15);
            if (!this.v) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(p0Var, property3, f16));
            this.f20805n.addListener(new n3(this));
            this.f20805n.setInterpolator(new OvershootInterpolator(1.02f));
            this.f20805n.start();
        } else if (z14) {
            p0Var.setVisibility(0);
            p0Var.setAlpha(1.0f);
            p0Var.setScaleX(1.0f);
            p0Var.setScaleY(1.0f);
            ii0Var.setVisibility(4);
            ii0Var.setAlpha(0.0f);
            ii0Var.setScaleX(0.0f);
            ii0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            p0Var.setVisibility(8);
            p0Var.setAlpha(0.0f);
            p0Var.setScaleX(0.0f);
            p0Var.setScaleY(0.0f);
            if (this.f20807s) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                ii0Var.setVisibility(4);
                ii0Var.setAlpha(0.0f);
                ii0Var.setScaleX(0.0f);
                ii0Var.setScaleY(0.0f);
                return;
            }
            ii0Var.setVisibility(0);
            ii0Var.setAlpha(1.0f);
            ii0Var.setScaleX(1.0f);
            ii0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l4 = this.f20810y;
            if (l4 != null && l4.longValue() == longValue) {
                this.f20810y = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f20808w, this.E, true);
            }
        }
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.d;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f20806r;
    }

    public TextView getTextView() {
        return this.f20802b;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f20809x) {
            NotificationCenter.getInstance(this.f20801a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.f20809x = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f20808w) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float height = getHeight() - 1;
            int width = getWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f20808w ? 1 : 0), 1073741824));
        int measuredWidth = this.e.getMeasuredWidth();
        TextView textView = this.f20804f;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = hg.c.z(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.f20802b, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.f20804f.setOnClickListener(onClickListener);
    }
}
