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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f36209a;
    public final j4 f36210b;
    public d3 f36211c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f36212f;

    public d1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.f36209a = b70Var;
        this.f36210b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f36211c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f36211c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36235s;
        this.f36209a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f36211c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36235s;
        this.f36209a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f36211c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36235s;
        this.f36209a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36211c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36211c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36212f != null && this.f36211c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f36209a, canvas, this, 0);
            this.f36211c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36211c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36209a, this.f36210b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f36212f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            j4 j4Var = this.f36210b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (j4Var != null) {
                HashSet hashSet = l4.f38728b1;
                webPage = j4Var.E;
            } else {
                webPage = null;
            }
            CharSequence C = l4.C(this.f36209a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f36212f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f36212f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f36212f.published_date * 1000);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r32, C)) != -1) {
                        r32 = Spannable.Factory.getInstance().newSpannable(r32);
                        for (int i14 = 0; i14 < metricAffectingSpanArr.length; i14++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i14];
                            r32.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i14]) + indexOf, 33);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            d3 q6 = l4.q(this.f36209a, this, r32, null, i12 - AndroidUtilities.dp(36.0f), this.e, this.f36212f, this.f36210b);
            this.f36211c = q6;
            if (q6 != null) {
                int height = this.f36211c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (j4Var != null && j4Var.G) {
                    this.d = (int) Math.floor(((i12 - this.f36211c.d.getLineLeft(0)) - this.f36211c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                d3 d3Var = this.f36211c;
                d3Var.f36235s = this.d;
                d3Var.v = this.e;
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
        if (!l4.l(this.f36209a, this.f36210b, motionEvent, this, this.f36211c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f36212f = pageblockauthordate;
        requestLayout();
    }
}
