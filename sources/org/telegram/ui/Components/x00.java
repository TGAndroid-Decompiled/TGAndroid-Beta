package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x00 extends LinearLayout {
    public final fi.d f40267a;
    public final fi.d f40268b;
    public final fi.d f40269c;
    public final long d;

    public x00(Context context, int i7) {
        super(context);
        int i10;
        TLRPC.TL_emojiList a10 = v8.a(i7);
        setOrientation(1);
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new ah0(2131624321, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(l9Var, c8.ha.r(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.G6, null);
        g10.setGravity(1);
        g10.setText(org.telegram.messenger.id.M0(2131750483, null));
        g10.setTypeface(org.telegram.messenger.g0.o());
        addView(g10, c8.ha.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27848c7, null);
        textView.setGravity(1);
        if (org.telegram.messenger.p10.i(i7).q()) {
            i10 = 2131750478;
        } else {
            i10 = 2131750479;
        }
        textView.setText(org.telegram.messenger.id.M0(i10, null));
        textView.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ha.t(-2, -2, 49, 0, 0, 0, 14));
        fi.d dVar = new fi.d(context, null, true);
        this.f40267a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.id.M0(2131750482, null), false, true);
        addView(dVar, c8.ha.r(-2, 44, 49));
        fi.d dVar2 = new fi.d(context, null, false);
        this.f40268b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wp(2131232477, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.id.M0(2131750480, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, c8.ha.t(-2, 44, 49, 0, 8, 0, 0));
        fi.d dVar3 = new fi.d(context, null, false);
        this.f40269c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a10.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a10.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new r5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131743797, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, c8.ha.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824);
        fi.d dVar = this.f40267a;
        dVar.setUseWrapContent(true);
        fi.d dVar2 = this.f40268b;
        dVar2.setUseWrapContent(true);
        fi.d dVar3 = this.f40269c;
        dVar3.setUseWrapContent(true);
        dVar.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar2.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar3.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int max = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar2.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar3.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        super.onMeasure(i7, i10);
    }

    public void setUseAnEmojiVisible(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f40269c.setVisibility(i7);
    }
}
