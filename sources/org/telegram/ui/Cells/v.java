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
import java.util.ArrayList;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f23158a;
    public final TextView f23159b;
    public final TextView f23160c;
    public final org.telegram.ui.Components.g9 d;
    public final ch0 e;
    public final ch0 f23161f;
    public boolean h;
    public Button f23162n;
    public AnimatorSet f23163r;
    public TLRPC.StickerSetCovered f23164s;
    public u f23165w;
    public boolean f23166x;

    public v(Context context, boolean z10) {
        super(context);
        this.f23158a = z10;
        if (z10) {
            ch0 ch0Var = new ch0(context);
            this.f23161f = ch0Var;
            this.f23162n = ch0Var;
            ch0Var.setText(cd.L0(2131754486, null));
            org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, null);
            ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
            ch0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 14.0f));
            Drawable background = ch0Var.getBackground();
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            ch0Var.setBackground(background);
            org.telegram.ui.ActionBar.a7.k(ch0Var, background, N, null, null);
            addView(ch0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.i0.L(60.0f);
            ch0 ch0Var2 = new ch0(context);
            this.e = ch0Var2;
            ch0Var2.setAllCaps(false);
            ch0Var2.setMinWidth(L);
            ch0Var2.setMinimumWidth(L);
            ch0Var2.setTextSize(1, 14.0f);
            int i11 = org.telegram.ui.ActionBar.t6.Fi;
            org.telegram.ui.ActionBar.a7.V(ch0Var2, i11, null);
            ch0Var2.setText(cd.L0(2131744873, null));
            y J0 = org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 25);
            ch0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.a7.k(ch0Var2, J0, null, h, null);
            ch0Var2.setTypeface(org.telegram.messenger.i0.o());
            w7.i6.a(ch0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ch0Var2.setOutlineProvider(null);
            addView(ch0Var2, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ch0Var.setOnClickListener(aVar);
            ch0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f23161f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.f23159b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.b6.y());
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23160c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, null);
        z20.o(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.b6.y());
        addView(textView2, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        addView(g9Var, w7.b6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i10;
        if (this.f23158a && this.f23166x != z10) {
            this.f23166x = z10;
            c(z11);
            if (z12 && (uVar = this.f23165w) != null) {
                ng.d dVar = (ng.d) uVar;
                org.telegram.ui.n nVar = ((org.telegram.ui.m) dVar.f13771b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) dVar.f13772c;
                a0.h hVar = nVar.f39798a;
                int i11 = 1;
                if (z10) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f19820id) < 0) {
                        ch0 ch0Var = this.f23161f;
                        if (ch0Var != null) {
                            ch0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f19820id);
                    } else {
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.k2) nVar).currentAccount;
                ui b02 = ui.b0(i10);
                Activity parentActivity = nVar.getParentActivity();
                if (z10) {
                    i11 = 2;
                }
                b02.f2(parentActivity, stickerSetCovered, i11, nVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        ic k10;
        this.h = z10;
        this.f23164s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.f23159b.setText(this.f23164s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.f23160c;
        if (z11) {
            textView.setText(cd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(cd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    document = arrayList.get(i10);
                    if (document != null && document.f19799id == j10) {
                        break;
                    }
                    i10++;
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
        org.telegram.ui.Components.g9 g9Var = this.d;
        if (document != null) {
            TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w9 == null) {
                w9 = document;
            }
            c00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, false);
            boolean z12 = w9 instanceof TLRPC.Document;
            if (z12) {
                k10 = ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document);
            } else {
                k10 = ic.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
            }
            ic icVar = k10;
            if (z12 && (jj.K2(document, true) || jj.N4(document))) {
                if (d != null) {
                    g9Var.p(ic.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    g9Var.l(ic.b(document), "50_50", icVar, null, 0, stickerSetCovered);
                    return;
                }
            } else if (icVar != null && icVar.f16109p == 1) {
                g9Var.k(icVar, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                g9Var.k(icVar, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        g9Var.k(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        ch0 ch0Var;
        if (this.f23158a) {
            AnimatorSet animatorSet = this.f23163r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.f23166x;
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z11) {
                f10 = 1.0f;
            }
            int i11 = 4;
            ch0 ch0Var2 = this.f23161f;
            ch0 ch0Var3 = this.e;
            if (z10) {
                if (z11) {
                    ch0Var = ch0Var3;
                } else {
                    ch0Var = ch0Var2;
                }
                this.f23162n = ch0Var;
                ch0Var2.setVisibility(0);
                ch0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23163r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f23163r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ch0Var3, property, f7);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ch0Var3, property2, f7);
                float[] fArr = {f7};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ch0Var3, property3, fArr), ObjectAnimator.ofFloat(ch0Var2, property, f10), ObjectAnimator.ofFloat(ch0Var2, property2, f10), ObjectAnimator.ofFloat(ch0Var2, property3, f10));
                this.f23163r.addListener(new org.telegram.ui.s9(this, 2));
                this.f23163r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f23163r.start();
                return;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ch0Var3.setVisibility(i10);
            ch0Var3.setAlpha(f7);
            ch0Var3.setScaleX(f7);
            ch0Var3.setScaleY(f7);
            if (!this.f23166x) {
                i11 = 0;
            }
            ch0Var2.setVisibility(i11);
            ch0Var2.setAlpha(f10);
            ch0Var2.setScaleX(f10);
            ch0Var2.setScaleY(f10);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f23164s;
    }

    @Override
    public final boolean isChecked() {
        return this.f23166x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.f23158a && view == this.f23159b) {
            i11 += Math.max(this.f23161f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.f23165w = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f23158a) {
            setChecked(!this.f23166x);
        }
    }
}
