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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.mz;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pg0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f32050a;
    public final TextView f32051b;
    public final TextView f32052c;
    public final org.telegram.ui.Components.q9 d;
    public final pg0 f32053e;
    public final pg0 f32054f;
    public boolean h;
    public Button f32055n;
    public AnimatorSet f32056r;
    public TLRPC.StickerSetCovered f32057s;
    public u f32058w;
    public boolean f32059x;

    public v(Context context, boolean z10) {
        super(context);
        this.f32050a = z10;
        if (z10) {
            pg0 pg0Var = new pg0(context);
            this.f32054f = pg0Var;
            this.f32055n = pg0Var;
            pg0Var.setText(hd.N0(2131754483, null));
            org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
            pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
            pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 14.0f));
            Drawable background = pg0Var.getBackground();
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            pg0Var.setBackground(background);
            org.telegram.ui.ActionBar.t6.j(pg0Var, background, M, null, null);
            addView(pg0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            pg0 pg0Var2 = new pg0(context);
            this.f32053e = pg0Var2;
            pg0Var2.setAllCaps(false);
            pg0Var2.setMinWidth(L);
            pg0Var2.setMinimumWidth(L);
            pg0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.m6.Ii;
            org.telegram.ui.ActionBar.t6.U(pg0Var2, i10, null);
            pg0Var2.setText(hd.N0(2131744614, null));
            y J0 = org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 25);
            pg0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.t6.j(pg0Var2, J0, null, g10, null);
            pg0Var2.setTypeface(org.telegram.messenger.g0.o());
            ya.a(pg0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            pg0Var2.setOutlineProvider(null);
            addView(pg0Var2, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            pg0Var.setOnClickListener(aVar);
            pg0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f32054f = null;
            this.f32053e = null;
        }
        TextView textView = new TextView(context);
        this.f32051b = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.na.y());
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32052c = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29758z6, null);
        o10.q(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.na.y());
        addView(textView2, c8.na.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        addView(q9Var, c8.na.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i7;
        if (this.f32050a && this.f32059x != z10) {
            this.f32059x = z10;
            c(z11);
            if (z12 && (uVar = this.f32058w) != null) {
                oi.e0 e0Var = (oi.e0) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) e0Var.f22034b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) e0Var.f22035c;
                a0.h hVar = oVar.f50376a;
                int i10 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f28425id) < 0) {
                        pg0 pg0Var = this.f32054f;
                        if (pg0Var != null) {
                            pg0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f28425id);
                    } else {
                        return;
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.g2) oVar).currentAccount;
                si d02 = si.d0(i7);
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
        gc k10;
        this.h = z10;
        this.f32057s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.f32051b.setText(this.f32057s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.f32052c;
        if (z11) {
            textView.setText(hd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(hd.G(stickerSet.count, "Stickers", new Object[0]));
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
                    if (document != null && document.f28404id == j3) {
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
        org.telegram.ui.Components.q9 q9Var = this.d;
        if (document != null) {
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document;
            }
            mz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.m6.f29290a7, 1.0f, false);
            boolean z12 = w10 instanceof TLRPC.Document;
            if (z12) {
                k10 = gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else {
                k10 = gc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            }
            gc gcVar = k10;
            if (z12 && (gj.K2(document, true) || gj.N4(document))) {
                if (d != null) {
                    q9Var.p(gc.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    q9Var.l(gc.b(document), "50_50", gcVar, null, 0, stickerSetCovered);
                    return;
                }
            } else if (gcVar != null && gcVar.f24089p == 1) {
                q9Var.k(gcVar, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                q9Var.k(gcVar, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        q9Var.k(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z10) {
        float f10;
        int i7;
        pg0 pg0Var;
        if (this.f32050a) {
            AnimatorSet animatorSet = this.f32056r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f32059x;
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
            pg0 pg0Var2 = this.f32054f;
            pg0 pg0Var3 = this.f32053e;
            if (z10) {
                if (z11) {
                    pg0Var = pg0Var3;
                } else {
                    pg0Var = pg0Var2;
                }
                this.f32055n = pg0Var;
                pg0Var2.setVisibility(0);
                pg0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32056r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f32056r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pg0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pg0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(pg0Var3, property3, fArr), ObjectAnimator.ofFloat(pg0Var2, property, f11), ObjectAnimator.ofFloat(pg0Var2, property2, f11), ObjectAnimator.ofFloat(pg0Var2, property3, f11));
                this.f32056r.addListener(new ki.m3(this, 22));
                this.f32056r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f32056r.start();
                return;
            }
            if (z11) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            pg0Var3.setVisibility(i7);
            pg0Var3.setAlpha(f10);
            pg0Var3.setScaleX(f10);
            pg0Var3.setScaleY(f10);
            if (!this.f32059x) {
                i10 = 0;
            }
            pg0Var2.setVisibility(i10);
            pg0Var2.setAlpha(f11);
            pg0Var2.setScaleX(f11);
            pg0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f32057s;
    }

    @Override
    public final boolean isChecked() {
        return this.f32059x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (this.f32050a && view == this.f32051b) {
            i10 += Math.max(this.f32054f.getMeasuredWidth(), this.f32053e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.f29470k0);
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
        this.f32058w = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f32050a) {
            setChecked(!this.f32059x);
        }
    }
}
