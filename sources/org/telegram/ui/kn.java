package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class kn extends View {
    public final ArrayList f35107a;
    public final ArrayList f35108b;
    public final wn f35109c;

    public kn(wn wnVar, Context context) {
        super(context);
        this.f35109c = wnVar;
        this.f35107a = new ArrayList();
        this.f35108b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f35107a;
        arrayList.clear();
        wn wnVar = this.f35109c;
        arrayList.add(wnVar.K1);
        arrayList.add(wnVar.f39694x0);
        arrayList.add(wnVar.X);
        arrayList.add(wnVar.K3);
        arrayList.add(wnVar.I1);
        arrayList.add(wnVar.X2);
        arrayList.add(wnVar.Y);
        arrayList.add(wnVar.f39520j1);
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
        wn wnVar = this.f35109c;
        wnVar.f39614qc = true;
        ArrayList arrayList = this.f35108b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wnVar.f39614qc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wn wnVar = this.f35109c;
        wnVar.f39614qc = true;
        ArrayList arrayList = this.f35107a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f35108b.add(view);
            }
        }
        wnVar.f39614qc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f35107a;
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
