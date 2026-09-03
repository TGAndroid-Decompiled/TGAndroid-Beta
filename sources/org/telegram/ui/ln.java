package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class ln extends View {
    public final ArrayList f38697a;
    public final ArrayList f38698b;
    public final xn f38699c;

    public ln(xn xnVar, Context context) {
        super(context);
        this.f38699c = xnVar;
        this.f38697a = new ArrayList();
        this.f38698b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f38697a;
        arrayList.clear();
        xn xnVar = this.f38699c;
        arrayList.add(xnVar.H1);
        arrayList.add(xnVar.f43340u0);
        arrayList.add(xnVar.U);
        arrayList.add(xnVar.H3);
        arrayList.add(xnVar.F1);
        arrayList.add(xnVar.U2);
        arrayList.add(xnVar.V);
        arrayList.add(xnVar.f43170g1);
        arrayList.add(xnVar.P);
        arrayList.add(xnVar.O1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xn xnVar = this.f38699c;
        xnVar.f43278oc = true;
        ArrayList arrayList = this.f38698b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        xnVar.f43278oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        xn xnVar = this.f38699c;
        xnVar.f43278oc = true;
        ArrayList arrayList = this.f38697a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38698b.add(view);
            }
        }
        xnVar.f43278oc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f38697a;
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
