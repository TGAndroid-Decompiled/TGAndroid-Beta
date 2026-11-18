package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class om extends View {
    public final ArrayList f50585a;
    public final ArrayList f50586b;
    public final bn f50587c;

    public om(bn bnVar, Context context) {
        super(context);
        this.f50587c = bnVar;
        this.f50585a = new ArrayList();
        this.f50586b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f50585a;
        arrayList.clear();
        bn bnVar = this.f50587c;
        arrayList.add(bnVar.Z1);
        arrayList.add(bnVar.A0);
        arrayList.add(bnVar.Z);
        arrayList.add(bnVar.Z3);
        arrayList.add(bnVar.X1);
        arrayList.add(bnVar.f46086m3);
        arrayList.add(bnVar.f45923a0);
        arrayList.add(bnVar.f46237y1);
        arrayList.add(bnVar.U);
        arrayList.add(bnVar.f46007g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bn bnVar = this.f50587c;
        bnVar.Zc = true;
        ArrayList arrayList = this.f50586b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        bnVar.Zc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        bn bnVar = this.f50587c;
        bnVar.Zc = true;
        ArrayList arrayList = this.f50585a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f50586b.add(view);
            }
        }
        bnVar.Zc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f50585a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
