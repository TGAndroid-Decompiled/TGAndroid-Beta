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
public final class d1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f37372a;
    public final j4 f37373b;
    public e3 f37374c;
    public int d;
    public final int f37375e;
    public TL_iv.pageBlockAuthorDate f37376f;

    public d1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f37375e = AndroidUtilities.dp(8.0f);
        this.f37372a = a70Var;
        this.f37373b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f37374c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f37374c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f37372a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f37374c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f37372a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f37374c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f37372a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f37374c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f37374c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37376f != null && this.f37374c != null) {
            canvas.save();
            canvas.translate(this.d, this.f37375e);
            l4.v(this.f37372a, canvas, this, 0);
            this.f37374c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f37374c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f37372a, this.f37373b, e3Var));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f37376f;
        int i12 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            j4 j4Var = this.f37373b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (j4Var != null) {
                HashSet hashSet = l4.X0;
                webPage = j4Var.A;
            } else {
                webPage = null;
            }
            CharSequence C = l4.C(this.f37372a, webPage, this, richText, richText, pageblockauthordate, size);
            i11 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f37376f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f37376f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f37376f.published_date * 1000);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r32, C)) != -1) {
                        r32 = Spannable.Factory.getInstance().newSpannable(r32);
                        for (int i13 = 0; i13 < metricAffectingSpanArr.length; i13++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i13];
                            r32.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i13]) + indexOf, 33);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            e3 q10 = l4.q(this.f37372a, this, r32, null, i11 - AndroidUtilities.dp(36.0f), this.f37375e, this.f37376f, this.f37373b);
            this.f37374c = q10;
            if (q10 != null) {
                int height = this.f37374c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (j4Var != null && j4Var.C) {
                    this.d = (int) Math.floor(((i11 - this.f37374c.d.getLineLeft(0)) - this.f37374c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                e3 e3Var = this.f37374c;
                e3Var.f37805s = this.d;
                e3Var.v = this.f37375e;
                i12 = height;
            } else {
                i12 = 0;
            }
        } else {
            i11 = size;
        }
        setMeasuredDimension(i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f37372a, this.f37373b, motionEvent, this, this.f37374c, this.d, this.f37375e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f37376f = pageblockauthordate;
        requestLayout();
    }
}
