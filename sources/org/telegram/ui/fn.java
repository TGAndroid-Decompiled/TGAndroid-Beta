package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

public final class fn extends View {

    public final ArrayList f38168a;

    public final ArrayList f38169b;

    public final rn f38170c;

    public fn(rn rnVar, Context context) {
        super(context);
        this.f38170c = rnVar;
        this.f38168a = new ArrayList();
        this.f38169b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f38168a;
        arrayList.clear();
        rn rnVar = this.f38170c;
        arrayList.add(rnVar.G1);
        arrayList.add(rnVar.f42213t0);
        arrayList.add(rnVar.T);
        arrayList.add(rnVar.G3);
        arrayList.add(rnVar.E1);
        arrayList.add(rnVar.T2);
        arrayList.add(rnVar.U);
        arrayList.add(rnVar.f42041f1);
        arrayList.add(rnVar.O);
        arrayList.add(rnVar.N1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn rnVar = this.f38170c;
        rnVar.f42150nc = true;
        ArrayList arrayList = this.f38169b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        rnVar.f42150nc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        rn rnVar = this.f38170c;
        rnVar.f42150nc = true;
        ArrayList arrayList = this.f38168a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38169b.add(view);
            }
        }
        rnVar.f42150nc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f38168a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
