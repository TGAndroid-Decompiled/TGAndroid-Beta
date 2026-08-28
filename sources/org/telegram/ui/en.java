package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class en extends View {
    public final ArrayList f37993a;
    public final ArrayList f37994b;
    public final qn f37995c;

    public en(qn qnVar, Context context) {
        super(context);
        this.f37995c = qnVar;
        this.f37993a = new ArrayList();
        this.f37994b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f37993a;
        arrayList.clear();
        qn qnVar = this.f37995c;
        arrayList.add(qnVar.G1);
        arrayList.add(qnVar.f42077t0);
        arrayList.add(qnVar.T);
        arrayList.add(qnVar.G3);
        arrayList.add(qnVar.E1);
        arrayList.add(qnVar.T2);
        arrayList.add(qnVar.U);
        arrayList.add(qnVar.f41905f1);
        arrayList.add(qnVar.O);
        arrayList.add(qnVar.N1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qn qnVar = this.f37995c;
        qnVar.f42014nc = true;
        ArrayList arrayList = this.f37994b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        qnVar.f42014nc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        qn qnVar = this.f37995c;
        qnVar.f42014nc = true;
        ArrayList arrayList = this.f37993a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f37994b.add(view);
            }
        }
        qnVar.f42014nc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f37993a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
