package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class ln extends View {
    public final ArrayList f35026a;
    public final ArrayList f35027b;
    public final xn f35028c;

    public ln(xn xnVar, Context context) {
        super(context);
        this.f35028c = xnVar;
        this.f35026a = new ArrayList();
        this.f35027b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f35026a;
        arrayList.clear();
        xn xnVar = this.f35028c;
        arrayList.add(xnVar.K1);
        arrayList.add(xnVar.f39596x0);
        arrayList.add(xnVar.X);
        arrayList.add(xnVar.K3);
        arrayList.add(xnVar.I1);
        arrayList.add(xnVar.X2);
        arrayList.add(xnVar.Y);
        arrayList.add(xnVar.f39422j1);
        arrayList.add(xnVar.S);
        arrayList.add(xnVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xn xnVar = this.f35028c;
        xnVar.f39516qc = true;
        ArrayList arrayList = this.f35027b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        xnVar.f39516qc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        xn xnVar = this.f35028c;
        xnVar.f39516qc = true;
        ArrayList arrayList = this.f35026a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f35027b.add(view);
            }
        }
        xnVar.f39516qc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f35026a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
