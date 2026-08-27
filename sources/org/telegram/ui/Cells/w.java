package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
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
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lh0;

public final class w extends FrameLayout implements Checkable {

    public final boolean f25833a;

    public final TextView f25834b;

    public final TextView f25835c;
    public final org.telegram.ui.Components.n9 d;

    public final lh0 f25836e;

    public final lh0 f25837f;
    public boolean h;

    public Button f25838n;

    public AnimatorSet f25839r;

    public TLRPC.StickerSetCovered f25840s;
    public v v;

    public boolean f25841w;

    public w(Context context, boolean z10) {
        super(context);
        this.f25833a = z10;
        if (z10) {
            lh0 lh0Var = new lh0(context);
            this.f25837f = lh0Var;
            this.f25838n = lh0Var;
            lh0Var.setText(LocaleController.getString(R.string.Add));
            lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            lh0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
            lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, iW0));
            addView(lh0Var, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int iDp = AndroidUtilities.dp(60.0f);
            lh0 lh0Var2 = new lh0(context);
            this.f25836e = lh0Var2;
            lh0Var2.setAllCaps(false);
            lh0Var2.setMinWidth(iDp);
            lh0Var2.setMinimumWidth(iDp);
            lh0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.Rh;
            lh0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            lh0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            lh0Var2.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
            lh0Var2.setTypeface(AndroidUtilities.bold());
            h7.f6.a(lh0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            lh0Var2.setOutlineProvider(null);
            addView(lh0Var2, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            lh0Var.setOnClickListener(aVar);
            lh0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f25837f = null;
            this.f25836e = null;
        }
        TextView textView = new TextView(context);
        this.f25834b = textView;
        rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(h7.z5.y());
        addView(textView, h7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25835c = textView2;
        rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(h7.z5.y());
        addView(textView2, h7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setLayerNum(1);
        addView(n9Var, h7.z5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        if (!this.f25833a || this.f25841w == z10) {
            return;
        }
        this.f25841w = z10;
        c(z11);
        if (!z12 || (vVar = this.v) == null) {
            return;
        }
        jh.z1 z1Var = (jh.z1) vVar;
        org.telegram.ui.q qVar = ((org.telegram.ui.p) z1Var.f14182b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) z1Var.f14183c;
        a0.h hVar = qVar.f41457a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.f22407id) >= 0) {
                return;
            }
            lh0 lh0Var = this.f25837f;
            if (lh0Var != null) {
                lh0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.f22407id);
        }
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) qVar).currentAccount).toggleStickerSet(qVar.getParentActivity(), stickerSetCovered, !z10 ? 1 : 2, qVar, false, false);
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        this.h = z10;
        this.f25840s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.f25834b.setText(this.f25840s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.f25835c;
        if (z11) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        TLRPC.Document document2 = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Document document3 = arrayList.get(i10);
                if (document3 != null && document3.f22386id == j10) {
                    document2 = document3;
                    break;
                }
            }
            if (document2 == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
                document2 = document;
            }
        } else {
            document = stickerSetCovered.cover;
            if (document != null) {
                document2 = document;
            } else if (!stickerSetCovered.covers.isEmpty()) {
                document2 = stickerSetCovered.covers.get(0);
            }
        }
        org.telegram.ui.Components.n9 n9Var = this.d;
        if (document2 == null) {
            n9Var.i(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        if (closestPhotoSizeWithSize == null) {
            closestPhotoSizeWithSize = document2;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f);
        boolean z12 = closestPhotoSizeWithSize instanceof TLRPC.Document;
        ImageLocation forDocument = z12 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, stickerSetCovered.set.thumb_version);
        if (z12 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
            if (svgThumb != null) {
                n9Var.n(ImageLocation.getForDocument(document2), "50_50", svgThumb, stickerSetCovered);
                return;
            } else {
                n9Var.j(ImageLocation.getForDocument(document2), "50_50", forDocument, null, 0, stickerSetCovered);
                return;
            }
        }
        if (forDocument == null || forDocument.imageType != 1) {
            n9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
        } else {
            n9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
        }
    }

    public final void c(boolean z10) {
        if (this.f25833a) {
            AnimatorSet animatorSet = this.f25839r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f25841w;
            float f10 = z11 ? 1.0f : 0.0f;
            float f11 = z11 ? 0.0f : 1.0f;
            lh0 lh0Var = this.f25837f;
            lh0 lh0Var2 = this.f25836e;
            if (!z10) {
                lh0Var2.setVisibility(z11 ? 0 : 4);
                lh0Var2.setAlpha(f10);
                lh0Var2.setScaleX(f10);
                lh0Var2.setScaleY(f10);
                lh0Var.setVisibility(this.f25841w ? 4 : 0);
                lh0Var.setAlpha(f11);
                lh0Var.setScaleX(f11);
                lh0Var.setScaleY(f11);
                return;
            }
            this.f25838n = z11 ? lh0Var2 : lh0Var;
            lh0Var.setVisibility(0);
            lh0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25839r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f25839r;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(lh0Var2, (Property<lh0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(lh0Var2, (Property<lh0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(lh0Var2, (Property<lh0, Float>) property3, fArr), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property, f11), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property2, f11), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property3, f11));
            this.f25839r.addListener(new lh.h9(this, 13));
            this.f25839r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f25839r.start();
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f25840s;
    }

    @Override
    public final boolean isChecked() {
        return this.f25841w;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f25833a && view == this.f25834b) {
            i11 += Math.max(this.f25837f.getMeasuredWidth(), this.f25836e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(v vVar) {
        this.v = vVar;
    }

    @Override
    public final void toggle() {
        if (this.f25833a) {
            setChecked(!this.f25841w);
        }
    }
}
