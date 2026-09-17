package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class pn extends View {
    public final ArrayList f36659a;
    public final ArrayList f36660b;
    public final bo f36661c;

    public pn(bo boVar, Context context) {
        super(context);
        this.f36661c = boVar;
        this.f36659a = new ArrayList();
        this.f36660b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f36659a;
        arrayList.clear();
        bo boVar = this.f36661c;
        arrayList.add(boVar.K1);
        arrayList.add(boVar.f32502x0);
        arrayList.add(boVar.X);
        arrayList.add(boVar.K3);
        arrayList.add(boVar.I1);
        arrayList.add(boVar.X2);
        arrayList.add(boVar.Y);
        arrayList.add(boVar.f32328j1);
        arrayList.add(boVar.S);
        arrayList.add(boVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bo boVar = this.f36661c;
        boVar.f32436rc = true;
        ArrayList arrayList = this.f36660b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        boVar.f32436rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        bo boVar = this.f36661c;
        boVar.f32436rc = true;
        ArrayList arrayList = this.f36659a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f36660b.add(view);
            }
        }
        boVar.f32436rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f36659a;
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
