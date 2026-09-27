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
public final class c1 extends View implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f32474a;
    public final h4 f32475b;
    public c3 f32476c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f32477f;

    public c1(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.f32474a = s70Var;
        this.f32475b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f32476c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f32476c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f32507s;
        this.f32474a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f32476c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f32507s;
        this.f32474a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f32476c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f32507s;
        this.f32474a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f32476c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f32476c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32477f != null && this.f32476c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f32474a, canvas, this, 0);
            this.f32476c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f32476c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f32474a, this.f32475b, c3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        ?? r32;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f32477f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            h4 h4Var = this.f32475b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (h4Var != null) {
                HashSet hashSet = j4.f34583b1;
                webPage = h4Var.E;
            } else {
                webPage = null;
            }
            CharSequence C = j4.C(this.f32474a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            if (this.f32477f.published_date != 0 && !TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f32477f.published_date * 1000), C);
            } else if (!TextUtils.isEmpty(C)) {
                r32 = LocaleController.formatString(R.string.ArticleByAuthor, C);
            } else {
                r32 = LocaleController.getInstance().getChatFullDate().format(this.f32477f.published_date * 1000);
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
            c3 q6 = j4.q(this.f32474a, this, r32, null, i12 - AndroidUtilities.dp(36.0f), this.e, this.f32477f, this.f32475b);
            this.f32476c = q6;
            if (q6 != null) {
                int height = this.f32476c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (h4Var != null && h4Var.G) {
                    this.d = (int) Math.floor(((i12 - this.f32476c.d.getLineLeft(0)) - this.f32476c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                } else {
                    this.d = AndroidUtilities.dp(18.0f);
                }
                c3 c3Var = this.f32476c;
                c3Var.f32507s = this.d;
                c3Var.v = this.e;
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
        if (!j4.l(this.f32474a, this.f32475b, motionEvent, this, this.f32476c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f32477f = pageblockauthordate;
        requestLayout();
    }
}
