package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.wi0;
public final class m3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public Long E;
    public boolean F;
    public Drawable G;
    public boolean f24435a;
    public final int f24436b;
    public final TextView f24437c;
    public final TextView d;
    public final org.telegram.ui.Components.y9 e;
    public final wi0 f24438f;
    public final TextView h;
    public final tg.p0 f24439n;
    public AnimatorSet f24440r;
    public TLRPC.StickerSetCovered f24441s;
    public boolean v;
    public boolean f24442w;
    public boolean f24443x;
    public boolean f24444y;

    public m3(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.f24435a = org.telegram.ui.ActionBar.y6.I.q();
        this.f24436b = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.f24437c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        vh.r(textView, 1, 16.0f, 1, 1);
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
        addView(textView, gb1.h(-2, -2.0f, i11, f7, 10.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23767z6, null);
        vh.r(textView2, 1, 13.0f, 1, 1);
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
        addView(textView2, gb1.h(-2, -2.0f, i13, f11, 35.0f, f12, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.e = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
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
        addView(y9Var, gb1.h(48, 48.0f, i14, f13, 8.0f, f14, 0.0f));
        wi0 wi0Var = new wi0(context);
        this.f24438f = wi0Var;
        wi0Var.setText(LocaleController.getString(R.string.Add));
        org.telegram.ui.ActionBar.f7.V(wi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
        addView(wi0Var, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.t.r(textView3, org.telegram.ui.ActionBar.y6.Rh, null, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        tg.p0 p0Var = new tg.p0(AndroidUtilities.dp(4.0f), context, u6Var, false);
        this.f24439n = p0Var;
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
        addView(this.f24439n, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
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
        AnimatorSet animatorSet = this.f24440r;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24440r = null;
        }
        this.f24443x = z10;
        this.f24441s = stickerSetCovered;
        setWillNotDraw(!z10);
        String str2 = this.f24441s.set.title;
        TextView textView = this.f24437c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(LocaleController.formatPluralString(str, stickerSet2.count, new Object[0]));
        boolean z15 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.f24436b;
        if (z15 && (stickerSet = stickerSetCovered.set) != null) {
            this.E = Long.valueOf(stickerSet.f22054id);
            if (!this.f24444y) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.f24444y = true;
            }
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i10).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false);
            if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
                document = stickerSet3.documents.get(0);
                int i11 = 0;
                while (true) {
                    if (i11 >= stickerSet3.documents.size()) {
                        break;
                    } else if (stickerSet3.documents.get(i11).f22033id == stickerSetCovered.set.thumb_document_id) {
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
                            if (stickerSetCovered.covers.get(i12).f22033id == stickerSetCovered.set.thumb_document_id) {
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
                            if (arrayList2.get(i13).f22033id == stickerSetCovered.set.thumb_document_id) {
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
        org.telegram.ui.Components.y9 y9Var = this.e;
        if (document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.y6.f23299a7, 1.0f);
                boolean z16 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                if (z16) {
                    forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
                } else {
                    forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                }
                if (z16 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                    if (svgThumb != null) {
                        y9Var.n(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                    } else {
                        y9Var.j(ImageLocation.getForDocument(document), "50_50", forSticker, null, 0, stickerSetCovered);
                    }
                } else if (forSticker != null && forSticker.imageType == 1) {
                    y9Var.i(forSticker, "50_50", "tgs", svgThumb, stickerSetCovered);
                } else {
                    y9Var.i(forSticker, "50_50", "webp", svgThumb, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    y9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    y9Var.i(ImageLocation.getForDocument(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            y9Var.i(null, null, "webp", null, stickerSetCovered2);
        }
        wi0 wi0Var = this.f24438f;
        wi0Var.setVisibility(0);
        this.F = z11;
        if (!z11 && !MediaDataController.getInstance(i10).isStickerPackInstalled(stickerSetCovered2.set.f22054id)) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.v = z13;
        if (!UserConfig.getInstance(i10).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f24442w = z14;
        tg.p0 p0Var = this.f24439n;
        TextView textView2 = this.h;
        if (z12) {
            if (z14) {
                p0Var.setVisibility(0);
                textView2.setVisibility(0);
                wi0Var.setVisibility(0);
            } else {
                p0Var.setVisibility(0);
                if (this.v) {
                    textView2.setVisibility(0);
                } else {
                    wi0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24440r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f24440r;
            if (this.v && !this.f24442w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.v && !this.f24442w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr2 = {f10};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.v && !this.f24442w) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr3 = {f11};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.v && !this.f24442w) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wi0Var, property, f12);
            if (!this.v && !this.f24442w) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wi0Var, property2, f13);
            if (!this.f24442w) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property3, f14);
            if (!this.f24442w) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(p0Var, property2, f15);
            if (!this.f24442w) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(p0Var, property3, f16));
            this.f24440r.addListener(new k3(this));
            this.f24440r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f24440r.start();
        } else if (z14) {
            p0Var.setVisibility(0);
            p0Var.setAlpha(1.0f);
            p0Var.setScaleX(1.0f);
            p0Var.setScaleY(1.0f);
            wi0Var.setVisibility(4);
            wi0Var.setAlpha(0.0f);
            wi0Var.setScaleX(0.0f);
            wi0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            p0Var.setVisibility(8);
            p0Var.setAlpha(0.0f);
            p0Var.setScaleX(0.0f);
            p0Var.setScaleY(0.0f);
            if (this.v) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                wi0Var.setVisibility(4);
                wi0Var.setAlpha(0.0f);
                wi0Var.setScaleX(0.0f);
                wi0Var.setScaleY(0.0f);
                return;
            }
            wi0Var.setVisibility(0);
            wi0Var.setAlpha(1.0f);
            wi0Var.setScaleX(1.0f);
            wi0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l4 = this.E;
            if (l4 != null && l4.longValue() == longValue) {
                this.E = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f24443x, this.F, true);
            }
        }
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f24441s;
    }

    public TextView getTextView() {
        return this.f24437c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24444y) {
            NotificationCenter.getInstance(this.f24436b).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.f24444y = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f24443x) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float f7 = dp;
            float height = getHeight() - 1;
            int width = getWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24443x ? 1 : 0), 1073741824));
        int measuredWidth = this.f24438f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = ic.a.A(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.f24437c, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f24438f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        wi0 wi0Var = this.f24438f;
        if (wi0Var != null) {
            wi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
            try {
                Drawable background = wi0Var.getBackground();
                if (background != null && background == this.G && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == x02 && this.f24435a == org.telegram.ui.ActionBar.y6.I.q()) {
                            return;
                        }
                        this.f24435a = org.telegram.ui.ActionBar.y6.I.q();
                        shapeDrawable.getPaint().setColor(x02);
                        rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.o6.b(x02)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
            wi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, x03));
            this.G = wi0Var.getBackground();
        }
    }
}
