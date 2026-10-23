package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class fn extends View {
    public final ArrayList f37371a;
    public final ArrayList f37372b;
    public final sn f37373c;

    public fn(sn snVar, Context context) {
        super(context);
        this.f37373c = snVar;
        this.f37371a = new ArrayList();
        this.f37372b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f37371a;
        arrayList.clear();
        sn snVar = this.f37373c;
        arrayList.add(snVar.W1);
        arrayList.add(snVar.f41737x0);
        arrayList.add(snVar.X);
        arrayList.add(snVar.W3);
        arrayList.add(snVar.U1);
        arrayList.add(snVar.f41563j3);
        arrayList.add(snVar.Y);
        arrayList.add(snVar.f41711v1);
        arrayList.add(snVar.S);
        arrayList.add(snVar.f41490d2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sn snVar = this.f37373c;
        snVar.Fc = true;
        ArrayList arrayList = this.f37372b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        snVar.Fc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        sn snVar = this.f37373c;
        snVar.Fc = true;
        ArrayList arrayList = this.f37371a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f37372b.add(view);
            }
        }
        snVar.Fc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f37371a;
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
