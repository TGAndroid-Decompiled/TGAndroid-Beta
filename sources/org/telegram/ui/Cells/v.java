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
import c8.ya;
import java.util.ArrayList;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.kz;
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.og0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f32133a;
    public final TextView f32134b;
    public final TextView f32135c;
    public final org.telegram.ui.Components.p9 d;
    public final og0 f32136e;
    public final og0 f32137f;
    public boolean h;
    public Button f32138n;
    public AnimatorSet f32139r;
    public TLRPC.StickerSetCovered f32140s;
    public u f32141w;
    public boolean f32142x;

    public v(Context context, boolean z10) {
        super(context);
        this.f32133a = z10;
        if (z10) {
            og0 og0Var = new og0(context);
            this.f32137f = og0Var;
            this.f32138n = og0Var;
            og0Var.setText(gd.N0(2131754483, null));
            org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, null);
            og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
            og0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 14.0f));
            Drawable background = og0Var.getBackground();
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            og0Var.setBackground(background);
            org.telegram.ui.ActionBar.u6.j(og0Var, background, M, null, null);
            addView(og0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            og0 og0Var2 = new og0(context);
            this.f32136e = og0Var2;
            og0Var2.setAllCaps(false);
            og0Var2.setMinWidth(L);
            og0Var2.setMinimumWidth(L);
            og0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.n6.Ii;
            org.telegram.ui.ActionBar.u6.U(og0Var2, i10, null);
            og0Var2.setText(gd.N0(2131744614, null));
            y J0 = org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 25);
            og0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.u6.j(og0Var2, J0, null, g10, null);
            og0Var2.setTypeface(org.telegram.messenger.g0.o());
            ya.a(og0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            og0Var2.setOutlineProvider(null);
            addView(og0Var2, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            og0Var.setOnClickListener(aVar);
            og0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f32137f = null;
            this.f32136e = null;
        }
        TextView textView = new TextView(context);
        this.f32134b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        m10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.na.y());
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32135c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, null);
        m10.q(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.na.y());
        addView(textView2, c8.na.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        addView(p9Var, c8.na.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i7;
        if (this.f32133a && this.f32142x != z10) {
            this.f32142x = z10;
            c(z11);
            if (z12 && (uVar = this.f32141w) != null) {
                oi.f0 f0Var = (oi.f0) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) f0Var.f22164b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) f0Var.f22165c;
                a0.h hVar = oVar.f50461a;
                int i10 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f28519id) < 0) {
                        og0 og0Var = this.f32137f;
                        if (og0Var != null) {
                            og0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f28519id);
                    } else {
                        return;
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.g2) oVar).currentAccount;
                ri d02 = ri.d0(i7);
                Activity parentActivity = oVar.getParentActivity();
                if (z10) {
                    i10 = 2;
                }
                d02.k2(parentActivity, stickerSetCovered, i10, oVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        fc k10;
        this.h = z10;
        this.f32140s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.f32134b.setText(this.f32140s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.f32135c;
        if (z11) {
            textView.setText(gd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(gd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j3 = stickerSetCovered.set.thumb_document_id;
            int i7 = 0;
            while (true) {
                if (i7 < arrayList.size()) {
                    document = arrayList.get(i7);
                    if (document != null && document.f28498id == j3) {
                        break;
                    }
                    i7++;
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
        org.telegram.ui.Components.p9 p9Var = this.d;
        if (document != null) {
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document;
            }
            kz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.n6.f29394a7, 1.0f, false);
            boolean z12 = w10 instanceof TLRPC.Document;
            if (z12) {
                k10 = fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else {
                k10 = fc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            }
            fc fcVar = k10;
            if (z12 && (fj.K2(document, true) || fj.N4(document))) {
                if (d != null) {
                    p9Var.p(fc.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    p9Var.l(fc.b(document), "50_50", fcVar, null, 0, stickerSetCovered);
                    return;
                }
            } else if (fcVar != null && fcVar.f23985p == 1) {
                p9Var.k(fcVar, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                p9Var.k(fcVar, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        p9Var.k(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z10) {
        float f10;
        int i7;
        og0 og0Var;
        if (this.f32133a) {
            AnimatorSet animatorSet = this.f32139r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f32142x;
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
            og0 og0Var2 = this.f32137f;
            og0 og0Var3 = this.f32136e;
            if (z10) {
                if (z11) {
                    og0Var = og0Var3;
                } else {
                    og0Var = og0Var2;
                }
                this.f32138n = og0Var;
                og0Var2.setVisibility(0);
                og0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32139r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f32139r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(og0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(og0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(og0Var3, property3, fArr), ObjectAnimator.ofFloat(og0Var2, property, f11), ObjectAnimator.ofFloat(og0Var2, property2, f11), ObjectAnimator.ofFloat(og0Var2, property3, f11));
                this.f32139r.addListener(new ki.n3(this, 22));
                this.f32139r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f32139r.start();
                return;
            }
            if (z11) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            og0Var3.setVisibility(i7);
            og0Var3.setAlpha(f10);
            og0Var3.setScaleX(f10);
            og0Var3.setScaleY(f10);
            if (!this.f32142x) {
                i10 = 0;
            }
            og0Var2.setVisibility(i10);
            og0Var2.setAlpha(f11);
            og0Var2.setScaleX(f11);
            og0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f32140s;
    }

    @Override
    public final boolean isChecked() {
        return this.f32142x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (this.f32133a && view == this.f32134b) {
            i10 += Math.max(this.f32137f.getMeasuredWidth(), this.f32136e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.f32141w = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f32133a) {
            setChecked(!this.f32142x);
        }
    }
}
