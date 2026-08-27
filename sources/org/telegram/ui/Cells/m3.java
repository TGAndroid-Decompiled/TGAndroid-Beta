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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lh0;

public final class m3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;

    public final int f24668a;

    public final TextView f24669b;

    public final TextView f24670c;
    public final org.telegram.ui.Components.n9 d;

    public final lh0 f24671e;

    public final TextView f24672f;
    public final ag.s1 h;

    public AnimatorSet f24673n;

    public TLRPC.StickerSetCovered f24674r;

    public boolean f24675s;
    public boolean v;

    public boolean f24676w;

    public boolean f24677x;

    public Long f24678y;

    public m3(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24668a = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.f24669b = textView;
        rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 22.0f : 71.0f, 10.0f, z10 ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24670c = textView2;
        rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, z11 ? 5 : 3, z11 ? 100.0f : 71.0f, 35.0f, z11 ? 71.0f : 100.0f, 0.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setLayerNum(1);
        boolean z12 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(48, 48.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 12.0f, 8.0f, z12 ? 12.0f : 0.0f, 0.0f));
        lh0 lh0Var = new lh0(context);
        this.f24671e = lh0Var;
        lh0Var.setText(LocaleController.getString(R.string.Add));
        lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        addView(lh0Var, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f24672f = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.y1.s(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Rh, false), 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(4.0f), context, c6Var, false);
        this.h = s1Var;
        s1Var.setIcon(R.raw.unlock_icon);
        s1Var.a(LocaleController.getString(R.string.Unlock), new a(this, 4), false);
        s1Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ((ViewGroup.MarginLayoutParams) s1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            s1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.h, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        lh0 lh0Var2 = this.f24671e;
        lh0Var2.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        lh0Var2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, iW0));
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        TLRPC.StickerSetCovered stickerSetCovered2;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f24673n;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24673n = null;
        }
        this.f24676w = z10;
        this.f24674r = stickerSetCovered;
        setWillNotDraw(!z10);
        String str = this.f24674r.set.title;
        TextView textView = this.f24669b;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        this.f24670c.setText(LocaleController.formatPluralString(stickerSet2.emojis ? "EmojiCount" : "Stickers", stickerSet2.count, new Object[0]));
        boolean z13 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.f24668a;
        if (!z13 || (stickerSet = stickerSetCovered.set) == null) {
            TLRPC.Document document2 = stickerSetCovered.cover;
            if (document2 != null) {
                document = document2;
                break;
            }
            if (!stickerSetCovered.covers.isEmpty()) {
                document = stickerSetCovered.covers.get(0);
                if (stickerSetCovered.set != null) {
                    for (int i11 = 0; i11 < stickerSetCovered.covers.size(); i11++) {
                        if (stickerSetCovered.covers.get(i11).f22386id == stickerSetCovered.set.thumb_document_id) {
                            document2 = stickerSetCovered.covers.get(i11);
                            document = document2;
                            break;
                        }
                    }
                }
            } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                    ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                    TLRPC.Document document3 = arrayList2.get(0);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            document = document3;
                            break;
                        } else {
                            if (arrayList2.get(i12).f22386id == stickerSetCovered.set.thumb_document_id) {
                                document2 = arrayList2.get(i12);
                                document = document2;
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
        } else {
            this.f24678y = Long.valueOf(stickerSet.f22407id);
            if (!this.f24677x) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
                this.f24677x = true;
            }
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i10).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false);
            if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
                document = stickerSet3.documents.get(0);
                for (int i13 = 0; i13 < stickerSet3.documents.size(); i13++) {
                    if (stickerSet3.documents.get(i13).f22386id == stickerSetCovered.set.thumb_document_id) {
                        document = stickerSet3.documents.get(i13);
                        break;
                    }
                }
            }
        }
        org.telegram.ui.Components.n9 n9Var = this.d;
        if (document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f);
                boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                ImageLocation forDocument = z14 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                if (z14 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                    if (svgThumb != null) {
                        n9Var.n(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                    } else {
                        n9Var.j(ImageLocation.getForDocument(document), "50_50", forDocument, null, 0, stickerSetCovered);
                    }
                } else if (forDocument == null || forDocument.imageType != 1) {
                    n9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                } else {
                    n9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    n9Var.i(ImageLocation.getForDocument(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            n9Var.i(null, null, "webp", null, stickerSetCovered2);
        }
        lh0 lh0Var = this.f24671e;
        lh0Var.setVisibility(0);
        this.A = z11;
        this.f24675s = z11 || MediaDataController.getInstance(i10).isStickerPackInstalled(stickerSetCovered2.set.f22407id);
        boolean z15 = !UserConfig.getInstance(i10).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2);
        this.v = z15;
        ag.s1 s1Var = this.h;
        TextView textView2 = this.f24672f;
        if (z12) {
            if (z15) {
                s1Var.setVisibility(0);
                textView2.setVisibility(0);
                lh0Var.setVisibility(0);
            } else {
                s1Var.setVisibility(0);
                if (this.f24675s) {
                    textView2.setVisibility(0);
                } else {
                    lh0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24673n = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f24673n;
            float[] fArr = {(!this.f24675s || this.v) ? 0.0f : 1.0f};
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {(!this.f24675s || this.v) ? 0.0f : 1.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {(!this.f24675s || this.v) ? 0.0f : 1.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property, (this.f24675s || this.v) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property2, (this.f24675s || this.v) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property3, !this.v ? 0.0f : 1.0f), ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property2, !this.v ? 0.0f : 1.0f), ObjectAnimator.ofFloat(s1Var, (Property<ag.s1, Float>) property3, !this.v ? 0.0f : 1.0f));
            this.f24673n.addListener(new k3(this));
            this.f24673n.setInterpolator(new OvershootInterpolator(1.02f));
            this.f24673n.start();
            return;
        }
        if (z15) {
            s1Var.setVisibility(0);
            s1Var.setAlpha(1.0f);
            s1Var.setScaleX(1.0f);
            s1Var.setScaleY(1.0f);
            lh0Var.setVisibility(4);
            lh0Var.setAlpha(0.0f);
            lh0Var.setScaleX(0.0f);
            lh0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            return;
        }
        s1Var.setVisibility(8);
        s1Var.setAlpha(0.0f);
        s1Var.setScaleX(0.0f);
        s1Var.setScaleY(0.0f);
        if (this.f24675s) {
            textView2.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            lh0Var.setVisibility(4);
            lh0Var.setAlpha(0.0f);
            lh0Var.setScaleX(0.0f);
            lh0Var.setScaleY(0.0f);
            return;
        }
        lh0Var.setVisibility(0);
        lh0Var.setAlpha(1.0f);
        lh0Var.setScaleX(1.0f);
        lh0Var.setScaleY(1.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.0f);
        textView2.setScaleY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            long jLongValue = ((Long) objArr[0]).longValue();
            Long l10 = this.f24678y;
            if (l10 == null || l10.longValue() != jLongValue) {
                return;
            }
            this.f24678y = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            a(tL_stickerSetNoCovered, this.f24676w, this.A, true);
        }
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.d;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f24674r;
    }

    public TextView getTextView() {
        return this.f24669b;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24677x) {
            NotificationCenter.getInstance(this.f24668a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.f24677x = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24676w) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24676w ? 1 : 0), 1073741824));
        int measuredWidth = this.f24671e.getMeasuredWidth();
        TextView textView = this.f24672f;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = i0.a.B(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.f24669b, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f24671e.setOnClickListener(onClickListener);
        this.f24672f.setOnClickListener(onClickListener);
    }
}
