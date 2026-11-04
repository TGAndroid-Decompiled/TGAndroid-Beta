package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s00 extends LinearLayout {
    public final gi.d f37873a;
    public final gi.d f37874b;
    public final gi.d f37875c;
    public final long d;

    public s00(Context context, int i3) {
        super(context);
        int i10;
        TLRPC.TL_emojiList a10 = t8.a(i3);
        setOrientation(1);
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new ch0(2131624321, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(k9Var, b8.mf.r(110, 110, 49));
        }
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.G6, null);
        g7.setGravity(1);
        g7.setText(org.telegram.messenger.bd.M0(2131750491, null));
        g7.setTypeface(org.telegram.messenger.g0.o());
        addView(g7, b8.mf.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27862c7, null);
        textView.setGravity(1);
        if (org.telegram.messenger.h10.i(i3).q()) {
            i10 = 2131750486;
        } else {
            i10 = 2131750487;
        }
        textView.setText(org.telegram.messenger.bd.M0(i10, null));
        textView.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, b8.mf.t(-2, -2, 49, 0, 0, 0, 14));
        gi.d dVar = new gi.d(context, null, true);
        this.f37873a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.bd.M0(2131750490, null), false, true);
        addView(dVar, b8.mf.r(-2, 44, 49));
        gi.d dVar2 = new gi.d(context, null, false);
        this.f37874b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wp(2131232477, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131750488, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, b8.mf.t(-2, 44, 49, 0, 8, 0, 0));
        gi.d dVar3 = new gi.d(context, null, false);
        this.f37875c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a10.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a10.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new p5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131743807, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, b8.mf.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824);
        gi.d dVar = this.f37873a;
        dVar.setUseWrapContent(true);
        gi.d dVar2 = this.f37874b;
        dVar2.setUseWrapContent(true);
        gi.d dVar3 = this.f37875c;
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
        super.onMeasure(i3, i10);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f37875c.setVisibility(i3);
    }
}
