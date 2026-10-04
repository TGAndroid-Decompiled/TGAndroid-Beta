package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class in implements oy {
    public final Utilities.Callback f27447a;
    public final fn f27448b;

    public in(Utilities.Callback callback, fn fnVar) {
        this.f27447a = callback;
        this.f27448b = fnVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        this.f27447a.run(new rh.h(document, obj));
        this.f27448b.dismiss(true);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        this.f27447a.run(new rh.h(document, null));
        this.f27448b.dismiss(true);
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void i(int i10) {
    }

    @Override
    public final void l(String str) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o(c61 c61Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void y(long j3) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
