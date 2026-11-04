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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dg0;
public final class q3 extends FrameLayout implements cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Long F;
    public boolean G;
    public Drawable H;
    public boolean f30186a;
    public final int f30187b;
    public final TextView f30188c;
    public final TextView d;
    public final org.telegram.ui.Components.k9 f30189e;
    public final dg0 f30190f;
    public final TextView h;
    public final vg.o0 f30191n;
    public AnimatorSet f30192r;
    public TLRPC.StickerSetCovered f30193s;
    public boolean f30194w;
    public boolean f30195x;
    public boolean f30196y;

    public q3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f30186a = org.telegram.ui.ActionBar.k6.I.q();
        this.f30187b = h10.f22829t0;
        TextView textView = new TextView(context);
        this.f30188c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        boolean z10 = bd.f21784a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z10) {
            f10 = 22.0f;
        } else {
            f10 = 71.0f;
        }
        if (z10) {
            f11 = 71.0f;
        } else {
            f11 = 22.0f;
        }
        addView(textView, mf.d(-2, -2.0f, i10, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z11) {
            f12 = 100.0f;
        } else {
            f12 = 71.0f;
        }
        if (z11) {
            f13 = 71.0f;
        } else {
            f13 = 100.0f;
        }
        addView(textView2, mf.d(-2, -2.0f, i12, f12, 35.0f, f13, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30189e = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        boolean z12 = bd.f21784a0;
        int i13 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f14 = 0.0f;
        } else {
            f14 = 12.0f;
        }
        if (z12) {
            f15 = 12.0f;
        } else {
            f15 = 0.0f;
        }
        addView(k9Var, mf.d(48, 48.0f, i13, f14, 8.0f, f15, 0.0f));
        dg0 dg0Var = new dg0(context);
        this.f30190f = dg0Var;
        dg0Var.setText(bd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
        addView(dg0Var, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.Fi, null, 1, 14.0f);
        textView3.setText(bd.M0(2131744865, null));
        addView(textView3, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(4.0f), context, e6Var, false);
        this.f30191n = o0Var;
        o0Var.setIcon(2131624314);
        o0Var.b(bd.M0(2131743886, null), new a(this, 4), false);
        o0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.f30191n, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        String str;
        TLRPC.Document document;
        TLRPC.Document document2;
        TLRPC.StickerSetCovered stickerSetCovered2;
        boolean z13;
        boolean z14;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        ac k10;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f30192r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30192r = null;
        }
        this.f30196y = z10;
        this.f30193s = stickerSetCovered;
        setWillNotDraw(!z10);
        String str2 = this.f30193s.set.title;
        TextView textView = this.f30188c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(bd.G(stickerSet2.count, str, new Object[0]));
        boolean z15 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i3 = this.f30187b;
        if (z15 && (stickerSet = stickerSetCovered.set) != null) {
            this.F = Long.valueOf(stickerSet.f27028id);
            if (!this.E) {
                hs.f(i3).c(this, hs.B0);
                this.E = true;
            }
            TLRPC.TL_messages_stickerSet l02 = li.b0(i3).l0(li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (l02 != null && (arrayList = l02.documents) != null && !arrayList.isEmpty()) {
                document = l02.documents.get(0);
                int i10 = 0;
                while (true) {
                    if (i10 >= l02.documents.size()) {
                        break;
                    } else if (l02.documents.get(i10).f27007id == stickerSetCovered.set.thumb_document_id) {
                        document = l02.documents.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            document = null;
        } else {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                    if (stickerSetCovered.set != null) {
                        for (int i11 = 0; i11 < stickerSetCovered.covers.size(); i11++) {
                            if (stickerSetCovered.covers.get(i11).f27007id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i11);
                                document = document2;
                                break;
                            }
                        }
                    }
                } else {
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                        if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                            document = arrayList2.get(0);
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (arrayList2.get(i12).f27007id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i12);
                                    document = document2;
                                    break;
                                }
                            }
                        }
                    }
                    document = null;
                }
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.f30189e;
        if (document != null) {
            if (zi.p(document)) {
                TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w10 == null) {
                    w10 = document;
                }
                jz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, false);
                boolean z16 = w10 instanceof TLRPC.Document;
                if (z16) {
                    k10 = ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
                } else {
                    k10 = ac.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
                }
                ac acVar = k10;
                if (z16 && (zi.L2(document, true) || zi.O4(document))) {
                    if (d != null) {
                        k9Var.p(ac.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        k9Var.l(ac.b(document), "50_50", acVar, null, 0, stickerSetCovered);
                    }
                } else if (acVar != null && acVar.f21497p == 1) {
                    k9Var.k(acVar, "50_50", "tgs", d, stickerSetCovered);
                } else {
                    k9Var.k(acVar, "50_50", "webp", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (w11 != null) {
                    k9Var.k(ac.c(w11, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    k9Var.k(ac.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            k9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        dg0 dg0Var = this.f30190f;
        dg0Var.setVisibility(0);
        this.G = z11;
        if (!z11 && !li.b0(i3).B0(stickerSetCovered2.set.f27028id, true)) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f30194w = z13;
        if (!h10.i(i3).q() && zi.V3(stickerSetCovered2)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f30195x = z14;
        vg.o0 o0Var = this.f30191n;
        TextView textView2 = this.h;
        if (z12) {
            if (z14) {
                o0Var.setVisibility(0);
                textView2.setVisibility(0);
                dg0Var.setVisibility(0);
            } else {
                o0Var.setVisibility(0);
                if (this.f30194w) {
                    textView2.setVisibility(0);
                } else {
                    dg0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30192r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f30192r;
            if (this.f30194w && !this.f30195x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f30194w && !this.f30195x) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr2 = {f11};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f30194w && !this.f30195x) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float[] fArr3 = {f12};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f30194w && !this.f30195x) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dg0Var, property, f13);
            if (!this.f30194w && !this.f30195x) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dg0Var, property2, f14);
            if (!this.f30195x) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(o0Var, property3, f15);
            if (!this.f30195x) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(o0Var, property2, f16);
            if (!this.f30195x) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(o0Var, property3, f17));
            this.f30192r.addListener(new o3(this));
            this.f30192r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f30192r.start();
        } else if (z14) {
            o0Var.setVisibility(0);
            o0Var.setAlpha(1.0f);
            o0Var.setScaleX(1.0f);
            o0Var.setScaleY(1.0f);
            dg0Var.setVisibility(4);
            dg0Var.setAlpha(0.0f);
            dg0Var.setScaleX(0.0f);
            dg0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            o0Var.setVisibility(8);
            o0Var.setAlpha(0.0f);
            o0Var.setScaleX(0.0f);
            o0Var.setScaleY(0.0f);
            if (this.f30194w) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                dg0Var.setVisibility(4);
                dg0Var.setAlpha(0.0f);
                dg0Var.setScaleX(0.0f);
                dg0Var.setScaleY(0.0f);
                return;
            }
            dg0Var.setVisibility(0);
            dg0Var.setAlpha(1.0f);
            dg0Var.setScaleX(1.0f);
            dg0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l10 = this.F;
            if (l10 != null && l10.longValue() == longValue) {
                this.F = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f30196y, this.G, true);
            }
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f30189e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f30193s;
    }

    public TextView getTextView() {
        return this.f30188c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E) {
            hs.f(this.f30187b).n(this, hs.B0);
            this.E = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.f30196y) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, height, width - i3, getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f30196y ? 1 : 0), 1073741824));
        int measuredWidth = this.f30190f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = k2.p1.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
        }
        measureChildWithMargins(this.f30188c, i3, measuredWidth, i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f30190f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        dg0 dg0Var = this.f30190f;
        if (dg0Var != null) {
            dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            try {
                Drawable background = dg0Var.getBackground();
                if (background != null && background == this.H && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == x02 && this.f30186a == org.telegram.ui.ActionBar.k6.I.q()) {
                            return;
                        }
                        this.f30186a = org.telegram.ui.ActionBar.k6.I.q();
                        shapeDrawable.getPaint().setColor(x02);
                        rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.y5.b(x02)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x03, 14.0f));
            this.H = dg0Var.getBackground();
        }
    }
}
