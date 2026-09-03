package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nn extends View {
    public final ArrayList f36540a;
    public final ArrayList f36541b;
    public final zn f36542c;

    public nn(zn znVar, Context context) {
        super(context);
        this.f36542c = znVar;
        this.f36540a = new ArrayList();
        this.f36541b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f36540a;
        arrayList.clear();
        zn znVar = this.f36542c;
        arrayList.add(znVar.H1);
        arrayList.add(znVar.f40759u0);
        arrayList.add(znVar.U);
        arrayList.add(znVar.H3);
        arrayList.add(znVar.F1);
        arrayList.add(znVar.U2);
        arrayList.add(znVar.V);
        arrayList.add(znVar.f40589g1);
        arrayList.add(znVar.P);
        arrayList.add(znVar.O1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zn znVar = this.f36542c;
        znVar.f40697oc = true;
        ArrayList arrayList = this.f36541b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        znVar.f40697oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        zn znVar = this.f36542c;
        znVar.f40697oc = true;
        ArrayList arrayList = this.f36540a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f36541b.add(view);
            }
        }
        znVar.f40697oc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f36540a;
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
