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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dh0;
public final class s3 extends FrameLayout implements vs, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public Long E;
    public boolean F;
    public Drawable G;
    public boolean f22998a;
    public final int f22999b;
    public final TextView f23000c;
    public final TextView d;
    public final org.telegram.ui.Components.g9 e;
    public final dh0 f23001f;
    public final TextView h;
    public final kg.x0 f23002n;
    public AnimatorSet f23003r;
    public TLRPC.StickerSetCovered f23004s;
    public boolean f23005w;
    public boolean f23006x;
    public boolean f23007y;

    public s3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
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
        this.f22998a = org.telegram.ui.ActionBar.t6.I.q();
        this.f22999b = e20.f15506s0;
        TextView textView = new TextView(context);
        this.f23000c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z10 = dd.X;
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
        addView(textView, w7.b6.d(-2, -2.0f, i11, f7, 10.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        a30.o(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        boolean z11 = dd.X;
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
        addView(textView2, w7.b6.d(-2, -2.0f, i13, f11, 35.0f, f12, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        boolean z12 = dd.X;
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
        addView(g9Var, w7.b6.d(48, 48.0f, i14, f13, 8.0f, f14, 0.0f));
        dh0 dh0Var = new dh0(context);
        this.f23001f = dh0Var;
        dh0Var.setText(dd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        addView(dh0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.Fi, null, 1, 14.0f);
        textView3.setText(dd.L0(2131744873, null));
        addView(textView3, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, p6Var, false);
        this.f23002n = x0Var;
        x0Var.setIcon(2131624312);
        x0Var.b(dd.L0(2131743901, null), new a(this, 4), false);
        x0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.f23002n, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        String str;
        TLRPC.Document document;
        TLRPC.Document document2;
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
        jc k10;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f23003r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23003r = null;
        }
        this.f23007y = z10;
        this.f23004s = stickerSetCovered;
        setWillNotDraw(!z10);
        String str2 = this.f23004s.set.title;
        TextView textView = this.f23000c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(dd.G(stickerSet2.count, str, new Object[0]));
        boolean z15 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.f22999b;
        if (z15 && (stickerSet = stickerSetCovered.set) != null) {
            this.E = Long.valueOf(stickerSet.f19821id);
            if (!this.D) {
                at.f(i10).c(this, at.B0);
                this.D = true;
            }
            TLRPC.TL_messages_stickerSet l02 = vi.b0(i10).l0(vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (l02 != null && (arrayList = l02.documents) != null && !arrayList.isEmpty()) {
                document = l02.documents.get(0);
                int i11 = 0;
                while (true) {
                    if (i11 >= l02.documents.size()) {
                        break;
                    } else if (l02.documents.get(i11).f19800id == stickerSetCovered.set.thumb_document_id) {
                        document = l02.documents.get(i11);
                        break;
                    } else {
                        i11++;
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
                        for (int i12 = 0; i12 < stickerSetCovered.covers.size(); i12++) {
                            if (stickerSetCovered.covers.get(i12).f19800id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i12);
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
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (arrayList2.get(i13).f19800id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i13);
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
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (document != null) {
            if (kj.p(document)) {
                TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w9 == null) {
                    w9 = document;
                }
                d00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.f20873a7, 1.0f, false);
                boolean z16 = w9 instanceof TLRPC.Document;
                if (z16) {
                    k10 = jc.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document);
                } else {
                    k10 = jc.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
                }
                jc jcVar = k10;
                if (z16 && (kj.K2(document, true) || kj.N4(document))) {
                    if (d != null) {
                        g9Var.p(jc.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        g9Var.l(jc.b(document), "50_50", jcVar, null, 0, stickerSetCovered);
                    }
                } else if (jcVar != null && jcVar.f16444p == 1) {
                    g9Var.k(jcVar, "50_50", "tgs", d, stickerSetCovered);
                } else {
                    g9Var.k(jcVar, "50_50", "webp", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if (w10 != null) {
                    g9Var.k(jc.c(w10, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    g9Var.k(jc.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            g9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        dh0 dh0Var = this.f23001f;
        dh0Var.setVisibility(0);
        this.F = z11;
        if (!z11 && !vi.b0(i10).B0(stickerSetCovered2.set.f19821id, true)) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f23005w = z13;
        if (!e20.i(i10).q() && kj.U3(stickerSetCovered2)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f23006x = z14;
        kg.x0 x0Var = this.f23002n;
        TextView textView2 = this.h;
        if (z12) {
            if (z14) {
                x0Var.setVisibility(0);
                textView2.setVisibility(0);
                dh0Var.setVisibility(0);
            } else {
                x0Var.setVisibility(0);
                if (this.f23005w) {
                    textView2.setVisibility(0);
                } else {
                    dh0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23003r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f23003r;
            if (this.f23005w && !this.f23006x) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f23005w && !this.f23006x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr2 = {f10};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f23005w && !this.f23006x) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr3 = {f11};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f23005w && !this.f23006x) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dh0Var, property, f12);
            if (!this.f23005w && !this.f23006x) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dh0Var, property2, f13);
            if (!this.f23006x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(x0Var, property3, f14);
            if (!this.f23006x) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(x0Var, property2, f15);
            if (!this.f23006x) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(x0Var, property3, f16));
            this.f23003r.addListener(new q3(this));
            this.f23003r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f23003r.start();
        } else if (z14) {
            x0Var.setVisibility(0);
            x0Var.setAlpha(1.0f);
            x0Var.setScaleX(1.0f);
            x0Var.setScaleY(1.0f);
            dh0Var.setVisibility(4);
            dh0Var.setAlpha(0.0f);
            dh0Var.setScaleX(0.0f);
            dh0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            x0Var.setVisibility(8);
            x0Var.setAlpha(0.0f);
            x0Var.setScaleX(0.0f);
            x0Var.setScaleY(0.0f);
            if (this.f23005w) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                dh0Var.setVisibility(4);
                dh0Var.setAlpha(0.0f);
                dh0Var.setScaleX(0.0f);
                dh0Var.setScaleY(0.0f);
                return;
            }
            dh0Var.setVisibility(0);
            dh0Var.setAlpha(1.0f);
            dh0Var.setScaleX(1.0f);
            dh0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l4 = this.E;
            if (l4 != null && l4.longValue() == longValue) {
                this.E = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f23007y, this.F, true);
            }
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f23004s;
    }

    public TextView getTextView() {
        return this.f23000c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            at.f(this.f22999b).n(this, at.B0);
            this.D = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f23007y) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(71.0f);
            }
            float f7 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.f23007y ? 1 : 0), 1073741824));
        int measuredWidth = this.f23001f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = i0.a.u(measuredWidth, measuredWidth2, 2, org.telegram.messenger.i0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.i0.L(14.0f);
        }
        measureChildWithMargins(this.f23000c, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f23001f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        dh0 dh0Var = this.f23001f;
        if (dh0Var != null) {
            dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            try {
                Drawable background = dh0Var.getBackground();
                if (background != null && background == this.G && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == x02 && this.f22998a == org.telegram.ui.ActionBar.t6.I.q()) {
                            return;
                        }
                        this.f22998a = org.telegram.ui.ActionBar.t6.I.q();
                        shapeDrawable.getPaint().setColor(x02);
                        rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.j6.b(x02)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
            dh0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x03, 14.0f));
            this.G = dh0Var.getBackground();
        }
    }
}
