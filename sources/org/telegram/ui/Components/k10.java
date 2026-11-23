package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k10 extends LinearLayout {
    public final hi.d f36709a;
    public final hi.d f36710b;
    public final hi.d f36711c;
    public final long d;

    public k10(Context context, int i7) {
        super(context);
        int i10;
        TLRPC.TL_emojiList a10 = a9.a(i7);
        setOrientation(1);
        q9 q9Var = new q9(context);
        q9Var.setImageDrawable(new oh0(2131624322, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(q9Var, c8.na.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.hd.N0(2131750466, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.na.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29330c7, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.k10.i(i7).q()) {
            i10 = 2131750461;
        } else {
            i10 = 2131750462;
        }
        textView2.setText(org.telegram.messenger.hd.N0(i10, null));
        textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.na.t(-2, -2, 49, 0, 0, 0, 14));
        hi.d dVar = new hi.d(context, null, true);
        this.f36709a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.hd.N0(2131750465, null), false, true);
        addView(dVar, c8.na.r(-2, 44, 49));
        hi.d dVar2 = new hi.d(context, null, false);
        this.f36710b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new nq(2131232479, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.N0(2131750463, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, c8.na.t(-2, 44, 49, 0, 8, 0, 0));
        hi.d dVar3 = new hi.d(context, null, false);
        this.f36711c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a10.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a10.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new y5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131743554, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, c8.na.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824);
        hi.d dVar = this.f36709a;
        dVar.setUseWrapContent(true);
        hi.d dVar2 = this.f36710b;
        dVar2.setUseWrapContent(true);
        hi.d dVar3 = this.f36711c;
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

    public void setUseAnEmojiVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f36711c.setVisibility(i7);
    }
}
