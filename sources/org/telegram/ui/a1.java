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
public final class a1 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f37608a;
    public final h4 f37609b;
    public a3 f37610c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f37611f;

    public a1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.f37608a = h70Var;
        this.f37609b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37610c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f37610c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37631s;
        this.f37608a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f37610c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37631s;
        this.f37608a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f37610c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37631s;
        this.f37608a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37610c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37610c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37611f != null && this.f37610c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f37608a, canvas, this, 0);
            this.f37610c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f37610c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f37608a, this.f37609b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f37611f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            h4 h4Var = this.f37609b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (h4Var != null) {
                HashSet hashSet = j4.f40402c1;
                webPage = h4Var.E;
            } else {
                webPage = null;
            }
            CharSequence C = j4.C(this.f37608a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f37611f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f37611f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f37611f.published_date * 1000);
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
            a3 q5 = j4.q(this.f37608a, this, r32, null, i12 - AndroidUtilities.dp(36.0f), this.e, this.f37611f, this.f37609b);
            this.f37610c = q5;
            if (q5 != null) {
                int height = this.f37610c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (h4Var != null && h4Var.G) {
                    this.d = (int) Math.floor(((i12 - this.f37610c.d.getLineLeft(0)) - this.f37610c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                a3 a3Var = this.f37610c;
                a3Var.f37631s = this.d;
                a3Var.v = this.e;
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
        if (!j4.l(this.f37608a, this.f37609b, motionEvent, this, this.f37610c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f37611f = pageblockauthordate;
        requestLayout();
    }
}
