package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class yf implements Runnable {
    public final int f17074a = 0;
    public final int f17075b;
    public final int f17076c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17077f;
    public final Object h;
    public final Cloneable f17078n;
    public final Object f17079r;
    public final Object f17080s;

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17075b = i10;
        this.d = arrayList;
        this.f17076c = i11;
        this.f17078n = iVar;
        this.f17079r = iVar2;
        this.f17077f = arrayList2;
        this.h = arrayList3;
        this.f17080s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17074a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17075b, this.d, this.f17076c, (a0.i) this.f17078n, (a0.i) this.f17079r, (ArrayList) this.f17077f, (ArrayList) this.h, (CountDownLatch) this.f17080s);
                return;
            default:
                xf.e eVar = (xf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17077f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17075b;
                xf.a0[] a0VarArr = (xf.a0[]) this.f17078n;
                int i11 = this.f17076c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17079r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17080s;
                if (!eVar.f45124o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f45121l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f45095b;
                    try {
                        synchronized (eVar.h) {
                            xf.d dVar = new xf.d(i11);
                            dVar.f45101c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(a0VarArr[i10].f45094a, 0, i12);
                            dVar.f45100b = i12;
                            a0VarArr[i10].b();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            atomicBoolean.set(true);
                            throw th2;
                        }
                        atomicBoolean.set(true);
                    }
                    countDownLatchArr[i10].countDown();
                    return;
                }
                return;
        }
    }

    public yf(xf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, xf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17077f = atomicBoolean;
        this.h = bitmapArr;
        this.f17075b = i10;
        this.f17078n = a0VarArr;
        this.f17076c = i11;
        this.f17079r = randomAccessFile;
        this.d = arrayList;
        this.f17080s = countDownLatchArr;
    }
}
