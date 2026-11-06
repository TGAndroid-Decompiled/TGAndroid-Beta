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
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ag0;
public final class v extends FrameLayout implements Checkable {
    public final boolean f30597a;
    public final TextView f30598b;
    public final TextView f30599c;
    public final org.telegram.ui.Components.l9 d;
    public final ag0 f30600e;
    public final ag0 f30601f;
    public boolean h;
    public Button f30602n;
    public AnimatorSet f30603r;
    public TLRPC.StickerSetCovered f30604s;
    public u f30605w;
    public boolean f30606x;

    public v(Context context, boolean z9) {
        super(context);
        this.f30597a = z9;
        if (z9) {
            ag0 ag0Var = new ag0(context);
            this.f30601f = ag0Var;
            this.f30602n = ag0Var;
            ag0Var.setText(hd.M0(2131754486, null));
            org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, null);
            ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            ag0Var.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 14.0f));
            Drawable background = ag0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            ag0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(ag0Var, background, N, null, null);
            addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            ag0 ag0Var2 = new ag0(context);
            this.f30600e = ag0Var2;
            ag0Var2.setAllCaps(false);
            ag0Var2.setMinWidth(L);
            ag0Var2.setMinimumWidth(L);
            ag0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Fi;
            org.telegram.ui.ActionBar.r6.V(ag0Var2, i10, null);
            ag0Var2.setText(hd.M0(2131744856, null));
            y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 25);
            ag0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(ag0Var2, J0, null, h, null);
            ag0Var2.setTypeface(org.telegram.messenger.g0.o());
            c8.ra.a(ag0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ag0Var2.setOutlineProvider(null);
            addView(ag0Var2, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ag0Var.setOnClickListener(aVar);
            ag0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f30601f = null;
            this.f30600e = null;
        }
        TextView textView = new TextView(context);
        this.f30598b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.ha.y());
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30599c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28258z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.ha.y());
        addView(textView2, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        addView(l9Var, c8.ha.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z9, boolean z10, boolean z11) {
        u uVar;
        int i7;
        if (this.f30597a && this.f30606x != z9) {
            this.f30606x = z9;
            c(z10);
            if (z11 && (uVar = this.f30605w) != null) {
                ni.c cVar = (ni.c) uVar;
                org.telegram.ui.o oVar = ((org.telegram.ui.n) cVar.f20614b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cVar.f20615c;
                a0.h hVar = oVar.f48152a;
                int i10 = 1;
                if (z9) {
                    a(false, false, false);
                    if (hVar.h(stickerSetCovered.set.f26979id) < 0) {
                        ag0 ag0Var = this.f30601f;
                        if (ag0Var != null) {
                            ag0Var.a(true, true);
                        }
                        hVar.k(stickerSetCovered, stickerSetCovered.set.f26979id);
                    } else {
                        return;
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.f2) oVar).currentAccount;
                ui b02 = ui.b0(i7);
                Activity parentActivity = oVar.getParentActivity();
                if (z9) {
                    i10 = 2;
                }
                b02.f2(parentActivity, stickerSetCovered, i10, oVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        TLRPC.Document document;
        hc k10;
        this.h = z9;
        this.f30604s = stickerSetCovered;
        setWillNotDraw(!z9);
        this.f30598b.setText(this.f30604s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z10 = stickerSet.emojis;
        TextView textView = this.f30599c;
        if (z10) {
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
                    if (document != null && document.f26958id == j3) {
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
        org.telegram.ui.Components.l9 l9Var = this.d;
        if (document != null) {
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document;
            }
            rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f27792a7, 1.0f, false);
            boolean z11 = w10 instanceof TLRPC.Document;
            if (z11) {
                k10 = hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else {
                k10 = hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            }
            hc hcVar = k10;
            if (z11 && (ij.L2(document, true) || ij.O4(document))) {
                if (d != null) {
                    l9Var.p(hc.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    l9Var.l(hc.b(document), "50_50", hcVar, null, 0, stickerSetCovered);
                    return;
                }
            } else if (hcVar != null && hcVar.f22865p == 1) {
                l9Var.k(hcVar, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                l9Var.k(hcVar, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        l9Var.k(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z9) {
        float f10;
        int i7;
        ag0 ag0Var;
        if (this.f30597a) {
            AnimatorSet animatorSet = this.f30603r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z10 = this.f30606x;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            int i10 = 4;
            ag0 ag0Var2 = this.f30601f;
            ag0 ag0Var3 = this.f30600e;
            if (z9) {
                if (z10) {
                    ag0Var = ag0Var3;
                } else {
                    ag0Var = ag0Var2;
                }
                this.f30602n = ag0Var;
                ag0Var2.setVisibility(0);
                ag0Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f30603r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.f30603r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ag0Var3, property, f10);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ag0Var3, property2, f10);
                float[] fArr = {f10};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ag0Var3, property3, fArr), ObjectAnimator.ofFloat(ag0Var2, property, f11), ObjectAnimator.ofFloat(ag0Var2, property2, f11), ObjectAnimator.ofFloat(ag0Var2, property3, f11));
                this.f30603r.addListener(new m.a(this, 21));
                this.f30603r.setInterpolator(new OvershootInterpolator(1.02f));
                this.f30603r.start();
                return;
            }
            if (z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            ag0Var3.setVisibility(i7);
            ag0Var3.setAlpha(f10);
            ag0Var3.setScaleX(f10);
            ag0Var3.setScaleY(f10);
            if (!this.f30606x) {
                i10 = 0;
            }
            ag0Var2.setVisibility(i10);
            ag0Var2.setAlpha(f11);
            ag0Var2.setScaleX(f11);
            ag0Var2.setScaleY(f11);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.f30604s;
    }

    @Override
    public final boolean isChecked() {
        return this.f30606x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (this.f30597a && view == this.f30598b) {
            i10 += Math.max(this.f30601f.getMeasuredWidth(), this.f30600e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z9) {
        a(z9, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.f30605w = uVar;
    }

    @Override
    public final void toggle() {
        if (this.f30597a) {
            setChecked(!this.f30606x);
        }
    }
}
