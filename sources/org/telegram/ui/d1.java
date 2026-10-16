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
public final class d1 extends View implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f34826a;
    public final i4 f34827b;
    public d3 f34828c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f34829f;

    public d1(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.f34826a = z70Var;
        this.f34827b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f34828c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f34828c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f34861s;
        this.f34826a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f34828c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f34861s;
        this.f34826a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f34828c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f34861s;
        this.f34826a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f34828c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f34828c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34829f != null && this.f34828c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f34826a, canvas, this, 0);
            this.f34828c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f34828c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f34826a, this.f34827b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f34829f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            i4 i4Var = this.f34827b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (i4Var != null) {
                HashSet hashSet = k4.f37234b1;
                webPage = i4Var.E;
            } else {
                webPage = null;
            }
            CharSequence C = k4.C(this.f34826a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f34829f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f34829f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f34829f.published_date * 1000);
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
            d3 q6 = k4.q(this.f34826a, this, r32, null, i12 - AndroidUtilities.dp(36.0f), this.e, this.f34829f, this.f34827b);
            this.f34828c = q6;
            if (q6 != null) {
                int height = this.f34828c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (i4Var != null && i4Var.G) {
                    this.d = (int) Math.floor(((i12 - this.f34828c.d.getLineLeft(0)) - this.f34828c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                d3 d3Var = this.f34828c;
                d3Var.f34861s = this.d;
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
        if (!k4.l(this.f34826a, this.f34827b, motionEvent, this, this.f34828c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f34829f = pageblockauthordate;
        requestLayout();
    }
}
