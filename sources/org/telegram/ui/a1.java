package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class a1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f35505a;
    public final f4 f35506b;
    public z2 f35507c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f35508f;

    public a1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.e = org.telegram.messenger.i0.L(8.0f);
        this.f35505a = m60Var;
        this.f35506b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f35507c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.f35505a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f35507c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.f35505a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f35507c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.f35505a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f35507c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f35507c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f35507c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35508f != null && this.f35507c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(this.f35505a, canvas, this, 0);
            this.f35507c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f35507c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.f35505a, this.f35506b, z2Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        ?? r42;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f35508f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            f4 f4Var = this.f35506b;
            if (f4Var != null) {
                HashSet hashSet = h4.f37702c1;
                webPage = f4Var.E;
            } else {
                webPage = null;
            }
            CharSequence A = h4.A(this.f35505a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (A instanceof Spannable) {
                spannable = (Spannable) A;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, A.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            if (this.f35508f.published_date != 0 && !TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.cd.a0(null, null, 2131754040, org.telegram.messenger.cd.D0().h0().format(this.f35508f.published_date * 1000), A);
            } else if (!TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.cd.a0(null, null, 2131754056, A);
            } else {
                r42 = org.telegram.messenger.cd.D0().h0().format(this.f35508f.published_date * 1000);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r42, A)) != -1) {
                        r42 = Spannable.Factory.getInstance().newSpannable(r42);
                        for (int i14 = 0; i14 < metricAffectingSpanArr.length; i14++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i14];
                            r42.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i14]) + indexOf, 33);
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            z2 o10 = h4.o(this.f35505a, this, r42, null, i12 - org.telegram.messenger.i0.L(36.0f), this.e, this.f35508f, this.f35506b);
            this.f35507c = o10;
            if (o10 != null) {
                int height = this.f35507c.d.getHeight() + org.telegram.messenger.i0.L(16.0f);
                if (f4Var != null && f4Var.G) {
                    this.d = (int) Math.floor(((i12 - this.f35507c.d.getLineLeft(0)) - this.f35507c.d.getLineWidth(0)) - org.telegram.messenger.i0.L(16.0f));
                } else {
                    this.d = org.telegram.messenger.i0.L(18.0f);
                }
                z2 z2Var = this.f35507c;
                z2Var.f43990s = this.d;
                z2Var.f43991w = this.e;
                i13 = height;
            } else {
                i13 = 0;
            }
        } else {
            i12 = size;
        }
        setMeasuredDimension(i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f35505a, this.f35506b, motionEvent, this, this.f35507c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f35508f = pageblockauthordate;
        requestLayout();
    }
}
