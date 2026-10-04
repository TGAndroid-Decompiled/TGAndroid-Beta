package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class mn extends View {
    public final ArrayList f38690a;
    public final ArrayList f38691b;
    public final yn f38692c;

    public mn(yn ynVar, Context context) {
        super(context);
        this.f38692c = ynVar;
        this.f38690a = new ArrayList();
        this.f38691b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f38690a;
        arrayList.clear();
        yn ynVar = this.f38692c;
        arrayList.add(ynVar.I1);
        arrayList.add(ynVar.f43533v0);
        arrayList.add(ynVar.V);
        arrayList.add(ynVar.I3);
        arrayList.add(ynVar.G1);
        arrayList.add(ynVar.V2);
        arrayList.add(ynVar.W);
        arrayList.add(ynVar.f43360h1);
        arrayList.add(ynVar.Q);
        arrayList.add(ynVar.P1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yn ynVar = this.f38692c;
        ynVar.f43455oc = true;
        ArrayList arrayList = this.f38691b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        ynVar.f43455oc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        yn ynVar = this.f38692c;
        ynVar.f43455oc = true;
        ArrayList arrayList = this.f38690a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38691b.add(view);
            }
        }
        ynVar.f43455oc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f38690a;
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
