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
public final class e1 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f37664a;
    public final k4 f37665b;
    public f3 f37666c;
    public int d;
    public final int f37667e;
    public TL_iv.pageBlockAuthorDate f37668f;

    public e1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37667e = AndroidUtilities.dp(8.0f);
        this.f37664a = d70Var;
        this.f37665b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37666c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f37666c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f37664a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f37666c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f37664a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f37666c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f37664a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37666c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37666c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37668f != null && this.f37666c != null) {
            canvas.save();
            canvas.translate(this.d, this.f37667e);
            m4.v(this.f37664a, canvas, this, 0);
            this.f37666c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37666c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37664a, this.f37665b, f3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f37668f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            k4 k4Var = this.f37665b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (k4Var != null) {
                HashSet hashSet = m4.X0;
                webPage = k4Var.A;
            } else {
                webPage = null;
            }
            CharSequence C = m4.C(this.f37664a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f37668f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f37668f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f37668f.published_date * 1000);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f3 q6 = m4.q(this.f37664a, this, r32, null, i12 - AndroidUtilities.dp(36.0f), this.f37667e, this.f37668f, this.f37665b);
            this.f37666c = q6;
            if (q6 != null) {
                int height = this.f37666c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (k4Var != null && k4Var.C) {
                    this.d = (int) Math.floor(((i12 - this.f37666c.d.getLineLeft(0)) - this.f37666c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                f3 f3Var = this.f37666c;
                f3Var.f37974s = this.d;
                f3Var.v = this.f37667e;
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
        if (!m4.l(this.f37664a, this.f37665b, motionEvent, this, this.f37666c, this.d, this.f37667e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f37668f = pageblockauthordate;
        requestLayout();
    }
}
