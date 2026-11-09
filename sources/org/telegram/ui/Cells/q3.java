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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bg0;
public final class q3 extends FrameLayout implements ls, org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public Long E;
    public boolean F;
    public Drawable G;
    public boolean f30118a;
    public final int f30119b;
    public final TextView f30120c;
    public final TextView d;
    public final org.telegram.ui.Components.l9 f30121e;
    public final bg0 f30122f;
    public final TextView h;
    public final ug.p0 f30123n;
    public AnimatorSet f30124r;
    public TLRPC.StickerSetCovered f30125s;
    public boolean f30126w;
    public boolean f30127x;
    public boolean f30128y;

    public q3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f30118a = org.telegram.ui.ActionBar.l6.I.q();
        this.f30119b = p10.f24470s0;
        TextView textView = new TextView(context);
        this.f30120c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        boolean z9 = id.f23157a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z9) {
            f10 = 22.0f;
        } else {
            f10 = 71.0f;
        }
        if (z9) {
            f11 = 71.0f;
        } else {
            f11 = 22.0f;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i10, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28275z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        boolean z10 = id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
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
        addView(textView2, c8.ha.d(-2, -2.0f, i12, f12, 35.0f, f13, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30121e = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        boolean z11 = id.f23157a0;
        int i13 = (z11 ? 5 : 3) | 48;
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
        addView(l9Var, c8.ha.d(48, 48.0f, i13, f14, 8.0f, f15, 0.0f));
        bg0 bg0Var = new bg0(context);
        this.f30122f = bg0Var;
        bg0Var.setText(id.M0(2131754486, null));
        org.telegram.ui.ActionBar.s6.U(bg0Var, org.telegram.ui.ActionBar.l6.Gi, null);
        addView(bg0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.l6.Fi, null, 1, 14.0f);
        textView3.setText(id.M0(2131744855, null));
        addView(textView3, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, g6Var, false);
        this.f30123n = p0Var;
        p0Var.setIcon(2131624314);
        p0Var.b(id.M0(2131743876, null), new a(this, 4), false);
        p0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.f30123n, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z9, boolean z10, boolean z11) {
        String str;
        TLRPC.Document document;
        TLRPC.Document document2;
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
        hc k10;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f30124r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30124r = null;
        }
        this.f30128y = z9;
        this.f30125s = stickerSetCovered;
        setWillNotDraw(!z9);
        String str2 = this.f30125s.set.title;
        TextView textView = this.f30120c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(id.G(stickerSet2.count, str, new Object[0]));
        boolean z14 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i7 = this.f30119b;
        if (z14 && (stickerSet = stickerSetCovered.set) != null) {
            this.E = Long.valueOf(stickerSet.f26983id);
            if (!this.D) {
                qs.f(i7).c(this, qs.B0);
                this.D = true;
            }
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i7).l0(ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (l02 != null && (arrayList = l02.documents) != null && !arrayList.isEmpty()) {
                document = l02.documents.get(0);
                int i10 = 0;
                while (true) {
                    if (i10 >= l02.documents.size()) {
                        break;
                    } else if (l02.documents.get(i10).f26962id == stickerSetCovered.set.thumb_document_id) {
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
                            if (stickerSetCovered.covers.get(i11).f26962id == stickerSetCovered.set.thumb_document_id) {
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
                                if (arrayList2.get(i12).f26962id == stickerSetCovered.set.thumb_document_id) {
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
        org.telegram.ui.Components.l9 l9Var = this.f30121e;
        if (document != null) {
            if (ij.p(document)) {
                TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w10 == null) {
                    w10 = document;
                }
                rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, false);
                boolean z15 = w10 instanceof TLRPC.Document;
                if (z15) {
                    k10 = hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
                } else {
                    k10 = hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
                }
                hc hcVar = k10;
                if (z15 && (ij.K2(document, true) || ij.N4(document))) {
                    if (d != null) {
                        l9Var.p(hc.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        l9Var.l(hc.b(document), "50_50", hcVar, null, 0, stickerSetCovered);
                    }
                } else if (hcVar != null && hcVar.f22878p == 1) {
                    l9Var.k(hcVar, "50_50", "tgs", d, stickerSetCovered);
                } else {
                    l9Var.k(hcVar, "50_50", "webp", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (w11 != null) {
                    l9Var.k(hc.c(w11, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    l9Var.k(hc.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            l9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        bg0 bg0Var = this.f30122f;
        bg0Var.setVisibility(0);
        this.F = z10;
        if (!z10 && !ui.b0(i7).B0(stickerSetCovered2.set.f26983id, true)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f30126w = z12;
        if (!p10.i(i7).q() && ij.U3(stickerSetCovered2)) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f30127x = z13;
        ug.p0 p0Var = this.f30123n;
        TextView textView2 = this.h;
        if (z11) {
            if (z13) {
                p0Var.setVisibility(0);
                textView2.setVisibility(0);
                bg0Var.setVisibility(0);
            } else {
                p0Var.setVisibility(0);
                if (this.f30126w) {
                    textView2.setVisibility(0);
                } else {
                    bg0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30124r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f30124r;
            if (this.f30126w && !this.f30127x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f30126w && !this.f30127x) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr2 = {f11};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f30126w && !this.f30127x) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float[] fArr3 = {f12};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f30126w && !this.f30127x) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bg0Var, property, f13);
            if (!this.f30126w && !this.f30127x) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bg0Var, property2, f14);
            if (!this.f30127x) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property3, f15);
            if (!this.f30127x) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(p0Var, property2, f16);
            if (!this.f30127x) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(p0Var, property3, f17));
            this.f30124r.addListener(new o3(this));
            this.f30124r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f30124r.start();
        } else if (z13) {
            p0Var.setVisibility(0);
            p0Var.setAlpha(1.0f);
            p0Var.setScaleX(1.0f);
            p0Var.setScaleY(1.0f);
            bg0Var.setVisibility(4);
            bg0Var.setAlpha(0.0f);
            bg0Var.setScaleX(0.0f);
            bg0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            p0Var.setVisibility(8);
            p0Var.setAlpha(0.0f);
            p0Var.setScaleX(0.0f);
            p0Var.setScaleY(0.0f);
            if (this.f30126w) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                bg0Var.setVisibility(4);
                bg0Var.setAlpha(0.0f);
                bg0Var.setScaleX(0.0f);
                bg0Var.setScaleY(0.0f);
                return;
            }
            bg0Var.setVisibility(0);
            bg0Var.setAlpha(1.0f);
            bg0Var.setScaleX(1.0f);
            bg0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l10 = this.E;
            if (l10 != null && l10.longValue() == longValue) {
                this.E = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f30128y, this.F, true);
            }
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f30121e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f30125s;
    }

    public TextView getTextView() {
        return this.f30120c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            qs.f(this.f30119b).n(this, qs.B0);
            this.D = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f30128y) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, height, width - i7, getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f30128y ? 1 : 0), 1073741824));
        int measuredWidth = this.f30122f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = jg.g.D(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
        }
        measureChildWithMargins(this.f30120c, i7, measuredWidth, i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f30122f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        bg0 bg0Var = this.f30122f;
        if (bg0Var != null) {
            bg0Var.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
            try {
                Drawable background = bg0Var.getBackground();
                if (background != null && background == this.G && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == x02 && this.f30118a == org.telegram.ui.ActionBar.l6.I.q()) {
                            return;
                        }
                        this.f30118a = org.telegram.ui.ActionBar.l6.I.q();
                        shapeDrawable.getPaint().setColor(x02);
                        rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.a6.b(x02)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
            org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
            bg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x03, 14.0f));
            this.G = bg0Var.getBackground();
        }
    }
}
