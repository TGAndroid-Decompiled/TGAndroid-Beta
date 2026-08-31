package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class ln extends View {
    public final ArrayList f38785a;
    public final ArrayList f38786b;
    public final xn f38787c;

    public ln(xn xnVar, Context context) {
        super(context);
        this.f38787c = xnVar;
        this.f38785a = new ArrayList();
        this.f38786b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f38785a;
        arrayList.clear();
        xn xnVar = this.f38787c;
        arrayList.add(xnVar.H1);
        arrayList.add(xnVar.f43362u0);
        arrayList.add(xnVar.U);
        arrayList.add(xnVar.H3);
        arrayList.add(xnVar.F1);
        arrayList.add(xnVar.U2);
        arrayList.add(xnVar.V);
        arrayList.add(xnVar.f43192g1);
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
        xn xnVar = this.f38787c;
        xnVar.f43300oc = true;
        ArrayList arrayList = this.f38786b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        xnVar.f43300oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        xn xnVar = this.f38787c;
        xnVar.f43300oc = true;
        ArrayList arrayList = this.f38785a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38786b.add(view);
            }
        }
        xnVar.f43300oc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f38785a;
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
