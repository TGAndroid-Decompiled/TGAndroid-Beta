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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gi0;
public final class o3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public final int f23288a;
    public final TextView f23289b;
    public final TextView f23290c;
    public final org.telegram.ui.Components.p9 d;
    public final gi0 f23291e;
    public final TextView f23292f;
    public final fg.b1 h;
    public AnimatorSet f23293n;
    public TLRPC.StickerSetCovered f23294r;
    public boolean f23295s;
    public boolean v;
    public boolean f23296w;
    public boolean f23297x;
    public Long f23298y;

    public o3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f23288a = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.f23289b = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
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
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z4) {
            f10 = 22.0f;
        } else {
            f10 = 71.0f;
        }
        if (z4) {
            f11 = 71.0f;
        } else {
            f11 = 22.0f;
        }
        addView(textView, k7.c6.d(-2, -2.0f, i11, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23290c = textView2;
        org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22053z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        if (z10) {
            f12 = 100.0f;
        } else {
            f12 = 71.0f;
        }
        if (z10) {
            f13 = 71.0f;
        } else {
            f13 = 100.0f;
        }
        addView(textView2, k7.c6.d(-2, -2.0f, i13, f12, 35.0f, f13, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        boolean z11 = LocaleController.isRTL;
        int i14 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f14 = 0.0f;
        } else {
            f14 = 12.0f;
        }
        if (z11) {
            f15 = 12.0f;
        } else {
            f15 = 0.0f;
        }
        addView(p9Var, k7.c6.d(48, 48.0f, i14, f14, 8.0f, f15, 0.0f));
        gi0 gi0Var = new gi0(context);
        this.f23291e = gi0Var;
        gi0Var.setText(LocaleController.getString(R.string.Add));
        gi0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        addView(gi0Var, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f23292f = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.y3.t(textView3, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Rh, false), 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        fg.b1 b1Var = new fg.b1(AndroidUtilities.dp(4.0f), context, g6Var, false);
        this.h = b1Var;
        b1Var.setIcon(R.raw.unlock_icon);
        b1Var.a(LocaleController.getString(R.string.Unlock), new a(this, 4), false);
        b1Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) b1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            b1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.h, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        gi0 gi0Var2 = this.f23291e;
        gi0Var2.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        gi0Var2.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z4, boolean z10, boolean z11) {
        String str;
        TLRPC.StickerSetCovered stickerSetCovered2;
        boolean z12;
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        ImageLocation forSticker;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f23293n;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23293n = null;
        }
        this.f23296w = z4;
        this.f23294r = stickerSetCovered;
        setWillNotDraw(!z4);
        String str2 = this.f23294r.set.title;
        TextView textView = this.f23289b;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.f23290c.setText(LocaleController.formatPluralString(str, stickerSet2.count, new Object[0]));
        boolean z14 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.f23288a;
        if (z14 && (stickerSet = stickerSetCovered.set) != null) {
            this.f23298y = Long.valueOf(stickerSet.f20870id);
            if (!this.f23297x) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.f23297x = true;
            }
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i10).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false);
            if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
                document = stickerSet3.documents.get(0);
                int i11 = 0;
                while (true) {
                    if (i11 >= stickerSet3.documents.size()) {
                        break;
                    } else if (stickerSet3.documents.get(i11).f20849id == stickerSetCovered.set.thumb_document_id) {
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
                            if (stickerSetCovered.covers.get(i12).f20849id == stickerSetCovered.set.thumb_document_id) {
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
                            if (arrayList2.get(i13).f20849id == stickerSetCovered.set.thumb_document_id) {
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
        org.telegram.ui.Components.p9 p9Var = this.d;
        if (document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f21605a7, 1.0f);
                boolean z15 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                if (z15) {
                    forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
                } else {
                    forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                }
                if (z15 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                    if (svgThumb != null) {
                        p9Var.n(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                    } else {
                        p9Var.j(ImageLocation.getForDocument(document), "50_50", forSticker, null, 0, stickerSetCovered);
                    }
                } else if (forSticker != null && forSticker.imageType == 1) {
                    p9Var.i(forSticker, "50_50", "tgs", svgThumb, stickerSetCovered);
                } else {
                    p9Var.i(forSticker, "50_50", "webp", svgThumb, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    p9Var.i(ImageLocation.getForDocument(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            p9Var.i(null, null, "webp", null, stickerSetCovered2);
        }
        gi0 gi0Var = this.f23291e;
        gi0Var.setVisibility(0);
        this.B = z10;
        if (!z10 && !MediaDataController.getInstance(i10).isStickerPackInstalled(stickerSetCovered2.set.f20870id)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f23295s = z12;
        if (!UserConfig.getInstance(i10).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.v = z13;
        fg.b1 b1Var = this.h;
        TextView textView2 = this.f23292f;
        if (z11) {
            if (z13) {
                b1Var.setVisibility(0);
                textView2.setVisibility(0);
                gi0Var.setVisibility(0);
            } else {
                b1Var.setVisibility(0);
                if (this.f23295s) {
                    textView2.setVisibility(0);
                } else {
                    gi0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23293n = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f23293n;
            if (this.f23295s && !this.v) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f23295s && !this.v) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr2 = {f11};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f23295s && !this.v) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float[] fArr3 = {f12};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f23295s && !this.v) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gi0Var, property, f13);
            if (!this.f23295s && !this.v) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gi0Var, property2, f14);
            if (!this.v) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b1Var, property3, f15);
            if (!this.v) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(b1Var, property2, f16);
            if (!this.v) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(b1Var, property3, f17));
            this.f23293n.addListener(new m3(this));
            this.f23293n.setInterpolator(new OvershootInterpolator(1.02f));
            this.f23293n.start();
        } else if (z13) {
            b1Var.setVisibility(0);
            b1Var.setAlpha(1.0f);
            b1Var.setScaleX(1.0f);
            b1Var.setScaleY(1.0f);
            gi0Var.setVisibility(4);
            gi0Var.setAlpha(0.0f);
            gi0Var.setScaleX(0.0f);
            gi0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            b1Var.setVisibility(8);
            b1Var.setAlpha(0.0f);
            b1Var.setScaleX(0.0f);
            b1Var.setScaleY(0.0f);
            if (this.f23295s) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                gi0Var.setVisibility(4);
                gi0Var.setAlpha(0.0f);
                gi0Var.setScaleX(0.0f);
                gi0Var.setScaleY(0.0f);
                return;
            }
            gi0Var.setVisibility(0);
            gi0Var.setAlpha(1.0f);
            gi0Var.setScaleX(1.0f);
            gi0Var.setScaleY(1.0f);
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
            Long l10 = this.f23298y;
            if (l10 != null && l10.longValue() == longValue) {
                this.f23298y = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f23296w, this.B, true);
            }
        }
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.d;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f23294r;
    }

    public TextView getTextView() {
        return this.f23289b;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23297x) {
            NotificationCenter.getInstance(this.f23288a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.f23297x = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f23296w) {
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
            canvas.drawLine(dp, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f23296w ? 1 : 0), 1073741824));
        int measuredWidth = this.f23291e.getMeasuredWidth();
        TextView textView = this.f23292f;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = l.d.d(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.f23289b, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f23291e.setOnClickListener(onClickListener);
        this.f23292f.setOnClickListener(onClickListener);
    }
}
