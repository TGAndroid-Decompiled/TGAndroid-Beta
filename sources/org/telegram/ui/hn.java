package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class hn extends View {
    public final ArrayList f38965a;
    public final ArrayList f38966b;
    public final tn f38967c;

    public hn(tn tnVar, Context context) {
        super(context);
        this.f38967c = tnVar;
        this.f38965a = new ArrayList();
        this.f38966b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f38965a;
        arrayList.clear();
        tn tnVar = this.f38967c;
        arrayList.add(tnVar.G1);
        arrayList.add(tnVar.f42973t0);
        arrayList.add(tnVar.T);
        arrayList.add(tnVar.G3);
        arrayList.add(tnVar.E1);
        arrayList.add(tnVar.T2);
        arrayList.add(tnVar.U);
        arrayList.add(tnVar.f42803f1);
        arrayList.add(tnVar.O);
        arrayList.add(tnVar.N1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tn tnVar = this.f38967c;
        tnVar.f42911nc = true;
        ArrayList arrayList = this.f38966b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        tnVar.f42911nc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        tn tnVar = this.f38967c;
        tnVar.f42911nc = true;
        ArrayList arrayList = this.f38965a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f38966b.add(view);
            }
        }
        tnVar.f42911nc = false;
    }

    @Override
    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
        a();
        ArrayList arrayList = this.f38965a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f9);
            }
        }
    }
}
