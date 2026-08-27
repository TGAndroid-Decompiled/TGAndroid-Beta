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

public final class e1 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f37587a;

    public final k4 f37588b;

    public f3 f37589c;
    public int d;

    public final int f37590e;

    public TL_iv.pageBlockAuthorDate f37591f;

    public e1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37590e = AndroidUtilities.dp(8.0f);
        this.f37587a = d70Var;
        this.f37588b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37589c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f37589c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f37587a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f37589c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f37587a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f37589c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f37587a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37589c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37589c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37591f == null || this.f37589c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.f37590e);
        m4.v(this.f37587a, canvas, this, 0);
        this.f37589c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37589c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37587a, this.f37588b, f3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        String str;
        String string;
        ?? NewSpannable;
        int iIndexOf;
        String string2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f37591f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            k4 k4Var = this.f37588b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (k4Var != null) {
                HashSet hashSet = m4.X0;
                webPage = k4Var.A;
            } else {
                webPage = null;
            }
            CharSequence charSequenceC = m4.C(this.f37587a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (charSequenceC instanceof Spannable) {
                Spannable spannable2 = (Spannable) charSequenceC;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, charSequenceC.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f37591f.published_date != 0 && !TextUtils.isEmpty(charSequenceC)) {
                string2 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(((long) this.f37591f.published_date) * 1000), charSequenceC);
            } else if (TextUtils.isEmpty(charSequenceC)) {
                str = LocaleController.getInstance().getChatFullDate().format(((long) this.f37591f.published_date) * 1000);
            } else {
                string = LocaleController.formatString(R.string.ArticleByAuthor, charSequenceC);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    NewSpannable = str;
                    NewSpannable = string;
                    NewSpannable = string2;
                    if (metricAffectingSpanArr.length > 0 && (iIndexOf = TextUtils.indexOf((CharSequence) NewSpannable, charSequenceC)) != -1) {
                        NewSpannable = Spannable.Factory.getInstance().newSpannable(NewSpannable);
                        for (int i14 = 0; i14 < metricAffectingSpanArr.length; i14++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i14];
                            NewSpannable.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + iIndexOf, spannable.getSpanEnd(metricAffectingSpanArr[i14]) + iIndexOf, 33);
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            NewSpannable = str;
            NewSpannable = string;
            NewSpannable = string2;
            f3 f3VarQ = m4.q(this.f37587a, this, NewSpannable, null, i12 - AndroidUtilities.dp(36.0f), this.f37590e, this.f37591f, this.f37588b);
            this.f37589c = f3VarQ;
            if (f3VarQ != null) {
                int height = this.f37589c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (k4Var == null || !k4Var.C) {
                    this.d = AndroidUtilities.dp(18.0f);
                } else {
                    this.d = (int) Math.floor(((i12 - this.f37589c.d.getLineLeft(0)) - this.f37589c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                }
                f3 f3Var = this.f37589c;
                f3Var.f37923s = this.d;
                f3Var.v = this.f37590e;
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
        return m4.l(this.f37587a, this.f37588b, motionEvent, this, this.f37589c, this.d, this.f37590e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f37591f = pageblockauthordate;
        requestLayout();
    }
}
