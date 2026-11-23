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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pg0;
public final class r3 extends FrameLayout implements gs, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public Long F;
    public boolean G;
    public Drawable H;
    public boolean f31681a;
    public final int f31682b;
    public final TextView f31683c;
    public final TextView d;
    public final org.telegram.ui.Components.q9 f31684e;
    public final pg0 f31685f;
    public final TextView h;
    public final ug.r0 f31686n;
    public AnimatorSet f31687r;
    public TLRPC.StickerSetCovered f31688s;
    public boolean f31689w;
    public boolean f31690x;
    public boolean f31691y;

    public r3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.f31681a = org.telegram.ui.ActionBar.m6.I.q();
        this.f31682b = k10.f24932t0;
        TextView textView = new TextView(context);
        this.f31683c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        boolean z10 = hd.f24408a0;
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
        addView(textView, c8.na.d(-2, -2.0f, i10, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29758z6, null);
        o10.q(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (hd.f24408a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        boolean z11 = hd.f24408a0;
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
        addView(textView2, c8.na.d(-2, -2.0f, i12, f12, 35.0f, f13, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31684e = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        boolean z12 = hd.f24408a0;
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
        addView(q9Var, c8.na.d(48, 48.0f, i13, f14, 8.0f, f15, 0.0f));
        pg0 pg0Var = new pg0(context);
        this.f31685f = pg0Var;
        pg0Var.setText(hd.N0(2131754483, null));
        org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
        addView(pg0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.Ii, null, 1, 14.0f);
        textView3.setText(hd.N0(2131744614, null));
        addView(textView3, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, h6Var, false);
        this.f31686n = r0Var;
        r0Var.setIcon(2131624315);
        r0Var.b(hd.N0(2131743633, null), new a(this, 4), false);
        r0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.f31686n, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
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
        gc k10;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.f31687r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31687r = null;
        }
        this.f31691y = z10;
        this.f31688s = stickerSetCovered;
        setWillNotDraw(!z10);
        String str2 = this.f31688s.set.title;
        TextView textView = this.f31683c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(hd.G(stickerSet2.count, str, new Object[0]));
        boolean z15 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i7 = this.f31682b;
        if (z15 && (stickerSet = stickerSetCovered.set) != null) {
            this.F = Long.valueOf(stickerSet.f28425id);
            if (!this.E) {
                ls.f(i7).c(this, ls.B0);
                this.E = true;
            }
            TLRPC.TL_messages_stickerSet n02 = si.d0(i7).n0(si.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (n02 != null && (arrayList = n02.documents) != null && !arrayList.isEmpty()) {
                document = n02.documents.get(0);
                int i10 = 0;
                while (true) {
                    if (i10 >= n02.documents.size()) {
                        break;
                    } else if (n02.documents.get(i10).f28404id == stickerSetCovered.set.thumb_document_id) {
                        document = n02.documents.get(i10);
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
                            if (stickerSetCovered.covers.get(i11).f28404id == stickerSetCovered.set.thumb_document_id) {
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
                                if (arrayList2.get(i12).f28404id == stickerSetCovered.set.thumb_document_id) {
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
        org.telegram.ui.Components.q9 q9Var = this.f31684e;
        if (document != null) {
            if (gj.p(document)) {
                TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w10 == null) {
                    w10 = document;
                }
                mz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.m6.f29290a7, 1.0f, false);
                boolean z16 = w10 instanceof TLRPC.Document;
                if (z16) {
                    k10 = gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
                } else {
                    k10 = gc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
                }
                gc gcVar = k10;
                if (z16 && (gj.K2(document, true) || gj.N4(document))) {
                    if (d != null) {
                        q9Var.p(gc.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        q9Var.l(gc.b(document), "50_50", gcVar, null, 0, stickerSetCovered);
                    }
                } else if (gcVar != null && gcVar.f24089p == 1) {
                    q9Var.k(gcVar, "50_50", "tgs", d, stickerSetCovered);
                } else {
                    q9Var.k(gcVar, "50_50", "webp", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (w11 != null) {
                    q9Var.k(gc.c(w11, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    q9Var.k(gc.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            q9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        pg0 pg0Var = this.f31685f;
        pg0Var.setVisibility(0);
        this.G = z11;
        if (!z11 && !si.d0(i7).E0(stickerSetCovered2.set.f28425id, true)) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f31689w = z13;
        if (!k10.i(i7).q() && gj.U3(stickerSetCovered2)) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f31690x = z14;
        ug.r0 r0Var = this.f31686n;
        TextView textView2 = this.h;
        if (z12) {
            if (z14) {
                r0Var.setVisibility(0);
                textView2.setVisibility(0);
                pg0Var.setVisibility(0);
            } else {
                r0Var.setVisibility(0);
                if (this.f31689w) {
                    textView2.setVisibility(0);
                } else {
                    pg0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31687r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f31687r;
            if (this.f31689w && !this.f31690x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.f31689w && !this.f31690x) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr2 = {f11};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.f31689w && !this.f31690x) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float[] fArr3 = {f12};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.f31689w && !this.f31690x) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pg0Var, property, f13);
            if (!this.f31689w && !this.f31690x) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pg0Var, property2, f14);
            if (!this.f31690x) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r0Var, property3, f15);
            if (!this.f31690x) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r0Var, property2, f16);
            if (!this.f31690x) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(r0Var, property3, f17));
            this.f31687r.addListener(new p3(this));
            this.f31687r.setInterpolator(new OvershootInterpolator(1.02f));
            this.f31687r.start();
        } else if (z14) {
            r0Var.setVisibility(0);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
            pg0Var.setVisibility(4);
            pg0Var.setAlpha(0.0f);
            pg0Var.setScaleX(0.0f);
            pg0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            r0Var.setVisibility(8);
            r0Var.setAlpha(0.0f);
            r0Var.setScaleX(0.0f);
            r0Var.setScaleY(0.0f);
            if (this.f31689w) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                pg0Var.setVisibility(4);
                pg0Var.setAlpha(0.0f);
                pg0Var.setScaleX(0.0f);
                pg0Var.setScaleY(0.0f);
                return;
            }
            pg0Var.setVisibility(0);
            pg0Var.setAlpha(1.0f);
            pg0Var.setScaleX(1.0f);
            pg0Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l10 = this.F;
            if (l10 != null && l10.longValue() == longValue) {
                this.F = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.f31691y, this.G, true);
            }
        }
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f31684e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f31688s;
    }

    public TextView getTextView() {
        return this.f31683c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E) {
            ls.f(this.f31682b).n(this, ls.B0);
            this.E = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f31691y) {
            if (hd.f24408a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (hd.f24408a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, height, width - i7, getHeight() - 1, org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f31691y ? 1 : 0), 1073741824));
        int measuredWidth = this.f31685f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = i5.c.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
        }
        measureChildWithMargins(this.f31683c, i7, measuredWidth, i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f31685f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        pg0 pg0Var = this.f31685f;
        if (pg0Var != null) {
            pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
            try {
                Drawable background = pg0Var.getBackground();
                if (background != null && background == this.H && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == x02 && this.f31681a == org.telegram.ui.ActionBar.m6.I.q()) {
                            return;
                        }
                        this.f31681a = org.telegram.ui.ActionBar.m6.I.q();
                        shapeDrawable.getPaint().setColor(x02);
                        rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.a6.b(x02)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
            pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x03, 14.0f));
            this.H = pg0Var.getBackground();
        }
    }
}
