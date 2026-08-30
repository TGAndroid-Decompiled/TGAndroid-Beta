package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class ln extends View {
    public final ArrayList f36109a;
    public final ArrayList f36110b;
    public final xn f36111c;

    public ln(xn xnVar, Context context) {
        super(context);
        this.f36111c = xnVar;
        this.f36109a = new ArrayList();
        this.f36110b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f36109a;
        arrayList.clear();
        xn xnVar = this.f36111c;
        arrayList.add(xnVar.H1);
        arrayList.add(xnVar.f40193u0);
        arrayList.add(xnVar.U);
        arrayList.add(xnVar.H3);
        arrayList.add(xnVar.F1);
        arrayList.add(xnVar.U2);
        arrayList.add(xnVar.V);
        arrayList.add(xnVar.f40023g1);
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
        xn xnVar = this.f36111c;
        xnVar.f40131oc = true;
        ArrayList arrayList = this.f36110b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        xnVar.f40131oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        xn xnVar = this.f36111c;
        xnVar.f40131oc = true;
        ArrayList arrayList = this.f36109a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f36110b.add(view);
            }
        }
        xnVar.f40131oc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f36109a;
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
