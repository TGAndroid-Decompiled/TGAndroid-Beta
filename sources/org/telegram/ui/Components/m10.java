package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m10 extends LinearLayout {
    public final vh.d f28239a;
    public final vh.d f28240b;
    public final vh.d f28241c;
    public final long d;

    public m10(Context context, int i10) {
        super(context);
        int i11;
        TLRPC.TL_emojiList a2 = q8.a(i10);
        setOrientation(1);
        g9 g9Var = new g9(context);
        g9Var.setImageDrawable(new bi0(2131624319, org.telegram.messenger.i0.L(110.0f), org.telegram.messenger.i0.L(110.0f)));
        if (!org.telegram.messenger.i0.Q1()) {
            addView(g9Var, w7.b6.r(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.G6, null);
        g10.setGravity(1);
        g10.setText(org.telegram.messenger.cd.L0(2131750492, null));
        g10.setTypeface(org.telegram.messenger.i0.o());
        addView(g10, w7.b6.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20911c7, null);
        textView.setGravity(1);
        if (org.telegram.messenger.d20.i(i10).q()) {
            i11 = 2131750487;
        } else {
            i11 = 2131750488;
        }
        textView.setText(org.telegram.messenger.cd.L0(i11, null));
        textView.setMaxWidth(org.telegram.messenger.i0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView, w7.b6.t(-2, -2, 49, 0, 0, 0, 14));
        vh.d dVar = new vh.d(context, null, true);
        this.f28239a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.cd.L0(2131750491, null), false, true);
        addView(dVar, w7.b6.r(-2, 44, 49));
        vh.d dVar2 = new vh.d(context, null, false);
        this.f28240b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new dq(2131232476, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.L0(2131750489, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, w7.b6.t(-2, 44, 49, 0, 8, 0, 0));
        vh.d dVar3 = new vh.d(context, null, false);
        this.f28241c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new o5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131743823, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, w7.b6.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824);
        vh.d dVar = this.f28239a;
        dVar.setUseWrapContent(true);
        vh.d dVar2 = this.f28240b;
        dVar2.setUseWrapContent(true);
        vh.d dVar3 = this.f28241c;
        dVar3.setUseWrapContent(true);
        dVar.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar2.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar3.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int max = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = org.telegram.messenger.i0.L(80.0f) + max;
        dVar2.getLayoutParams().width = org.telegram.messenger.i0.L(80.0f) + max;
        dVar3.getLayoutParams().width = org.telegram.messenger.i0.L(80.0f) + max;
        super.onMeasure(i10, i11);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28241c.setVisibility(i10);
    }
}
