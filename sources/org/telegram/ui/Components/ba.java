package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class ba {
    public int f27120a;
    public final View f27121b;
    public final ArrayList f27122c;
    public final ArrayList d;
    public final ArrayList f27123e;
    public final Object f27124f;
    public EGLContext f27125g;
    public final Object h;
    public int f27126i;
    public kh.ib f27127j;
    public Object f27128k;
    public Object f27129l;
    public ha f27130m;
    public final ga f27131n;
    public Bitmap f27132o;
    public int f27133p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.f27122c = arrayList;
        this.d = new ArrayList();
        this.f27123e = new ArrayList();
        this.f27124f = new Object();
        this.h = new Object();
        this.f27131n = new ga(0, new fg(this, 14));
        this.f27133p = 0;
        this.f27121b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new af.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f27124f) {
            try {
                if (this.f27125g == null) {
                    this.f27125g = eGLContext;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f27130m;
        if (haVar == null) {
            return this.f27132o;
        }
        synchronized (haVar.f29015n) {
            try {
                if (!haVar.f29018q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f29017p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f27132o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f27129l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((fa) obj).f28352b.invalidate();
        }
        ArrayList arrayList2 = this.f27123e;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f27130m;
        if (haVar != null) {
            synchronized (haVar.f29015n) {
                haVar.f29018q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i9 = this.f27133p;
        this.f27133p = i9 + 1;
        sb2.append(i9);
        this.f27132o = this.f27131n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(kh.ib ibVar, Object obj) {
        this.f27127j = ibVar;
        this.f27128k = obj;
        this.f27126i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f27129l = renderNode2;
            return;
        }
        this.f27129l = null;
    }
}
