package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class kn extends View {
    public final ArrayList f35075a;
    public final ArrayList f35076b;
    public final wn f35077c;

    public kn(wn wnVar, Context context) {
        super(context);
        this.f35077c = wnVar;
        this.f35075a = new ArrayList();
        this.f35076b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f35075a;
        arrayList.clear();
        wn wnVar = this.f35077c;
        arrayList.add(wnVar.K1);
        arrayList.add(wnVar.f39680x0);
        arrayList.add(wnVar.X);
        arrayList.add(wnVar.K3);
        arrayList.add(wnVar.I1);
        arrayList.add(wnVar.X2);
        arrayList.add(wnVar.Y);
        arrayList.add(wnVar.f39506j1);
        arrayList.add(wnVar.S);
        arrayList.add(wnVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wn wnVar = this.f35077c;
        wnVar.f39600qc = true;
        ArrayList arrayList = this.f35076b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wnVar.f39600qc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wn wnVar = this.f35077c;
        wnVar.f39600qc = true;
        ArrayList arrayList = this.f35075a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f35076b.add(view);
            }
        }
        wnVar.f39600qc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f35075a;
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
