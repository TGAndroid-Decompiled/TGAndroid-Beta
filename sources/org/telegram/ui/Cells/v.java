package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.tf;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dg0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f30696a;
    public final TextView f30697b;
    public final TextView f30698c;
    public final org.telegram.ui.Components.k9 d;
    public final dg0 f30699e;
    public final dg0 f30700f;
    public boolean h;
    public Button f30701n;
    public AnimatorSet f30702r;
    public TLRPC.StickerSetCovered f30703s;
    public u f30704w;
    public boolean f30705x;

    public v(Context context, boolean z10) {
        super(context);
        this.f30696a = z10;
        if (z10) {
            dg0 dg0Var = new dg0(context);
            this.f30700f = dg0Var;
            this.f30701n = dg0Var;
            dg0Var.setText(bd.M0(2131754486, null));
            org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
            dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
            Drawable background = dg0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            dg0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(dg0Var, background, N, null, null);
            addView(dg0Var, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            dg0 dg0Var2 = new dg0(context);
            this.f30699e = dg0Var2;
            dg0Var2.setAllCaps(false);
            dg0Var2.setMinWidth(L);
            dg0Var2.setMinimumWidth(L);
            dg0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Fi;
            org.telegram.ui.ActionBar.r6.V(dg0Var2, i10, null);
            dg0Var2.setText(bd.M0(2131744865, null));
            y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 25);
            dg0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(dg0Var2, J0, null, h, null);
            dg0Var2.setTypeface(org.telegram.messenger.g0.o());
            tf.a(dg0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            dg0Var2.setOutlineProvider(null);
            addView(dg0Var2, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            dg0Var.setOnClickListener(aVar);
            dg0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f30700f = null;
            this.f30699e = null;
        }
        TextView textView = new TextView(context);
        this.f30697b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(mf.y());
        addView(textView, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30698c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(mf.y());
        addView(textView2, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        addView(k9Var, mf.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i3;
        if (this.f30696a && this.f30705x != z10) {
            this.f30705x = z10;
            c(z11);
            if (z12 && (uVar = this.f30704w) != null) {
                mi.d4 d4Var = (mi.d4) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) d4Var.f19563b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d4Var.f19564c;
                a0.h hVar = oVar.f48149a;
                int i10 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f27028id) < 0) {
                        dg0 dg0Var = this.f30700f;
                        if (dg0Var != null) {
                            dg0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f27028id);
                    } else {
                        return;
                    }
                }
                i3 = ((org.telegram.ui.ActionBar.d2) oVar).currentAccount;
                li b02 = li.b0(i3);
                Activity parentActivity = oVar.getParentActivity();
                if (z10) {
                    i10 = 2;
                }
                b02.f2(parentActivity, stickerSetCovered, i10, oVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        ac k10;
        this.h = z10;
        this.f30703s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.f30697b.setText(this.f30703s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.f30698c;
        if (z11) {
            textView.setText(bd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(bd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            int i3 = 0;
            while (true) {
                if (i3 < arrayList.size()) {
                    document = arrayList.get(i3);
                    if (document != null && document.f27007id == j10) {
                        break;
                    }
                    i3++;
                } else {
                    document = null;
                    break;
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        } else {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                } else {
                    document = null;
                }
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.d;
        if (document != null) {
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document;
            }
            jz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, false);
            boolean z12 = w10 instanceof TLRPC.Document;
            if (z12) {
                k10 = ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else {
                k10 = ac.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            }
            ac acVar = k10;
            if (z12 && (zi.L2(document, true) || zi.O4(document))) {
                if (d != null) {
                    k9Var.p(ac.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    k9Var.l(ac.b(document), "50_50", acVar, null, 0, stickerSetCovered);
                    return;
                }
            } else if (acVar != null && acVar.f21497p == 1) {
                k9Var.k(acVar, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                k9Var.k(acVar, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        k9Var.k(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z10) {
        float f10;
        int i3;
        dg0 dg0Var;
        if (this.f30696a) {
            AnimatorSet animatorSet = this.f30702r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f30705x;
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z11) {
                f11 = 1.0f;
            }
            int i10 = 4;
            dg0 dg0Var2 = this.f30700f;
            dg0 dg0Var3 = this.f30699e;
            if (z10) {
                if (z11) {
                    dg0Var = dg0Var3;
                } else {
                    dg0Var = dg0Var2;
                }
                this.f30701n = dg0Var;
                dg0Var2.setVisibility(0);
                dg0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f30702r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f30702r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var3, property3, fArr), ObjectAnimator.ofFloat(dg0Var2, property, f11), ObjectAnimator.ofFloat(dg0Var2, property2, f11), ObjectAnimator.ofFloat(dg0Var2, property3, f11));
                this.f30702r.addListener(new ii.v3(this, 22));
                this.f30702r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f30702r.start();
                return;
            }
            if (z11) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            dg0Var3.setVisibility(i3);
            dg0Var3.setAlpha(f10);
            dg0Var3.setScaleX(f10);
            dg0Var3.setScaleY(f10);
            if (!this.f30705x) {
                i10 = 0;
            }
            dg0Var2.setVisibility(i10);
            dg0Var2.setAlpha(f11);
            dg0Var2.setScaleX(f11);
            dg0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f30703s;
    }

    @Override
    public final boolean isChecked() {
        return this.f30705x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (this.f30696a && view == this.f30697b) {
            i10 += Math.max(this.f30700f.getMeasuredWidth(), this.f30699e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i3, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.f30704w = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f30696a) {
            setChecked(!this.f30705x);
        }
    }
}
