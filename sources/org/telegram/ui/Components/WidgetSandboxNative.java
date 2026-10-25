package org.telegram.ui.Components;

import android.graphics.Bitmap;
final class WidgetSandboxNative {
    private WidgetSandboxNative() {
    }

    public static native void arbiterCancel(long j10);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j10);

    public static native int arbiterDown(long j10, double d, double d10, double d11, boolean z10, boolean z11, boolean z12, boolean z13, int i10);

    public static native double arbiterHoldDeadline(long j10);

    public static native int arbiterMove(long j10, double d, double d10, double d11);

    public static native int arbiterTick(long j10, double d);

    public static native int arbiterUp(long j10, double d, double d10, double d11);

    public static native void attackScan(boolean z10);

    public static native void conformance(boolean z10);

    public static native long create(byte[] bArr, byte[] bArr2, byte[] bArr3, float f7, float f10, int i10, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z10, WidgetSandboxBackend widgetSandboxBackend);

    public static native void destroy(long j10);

    public static native void filterPixels(Bitmap bitmap, byte[] bArr, float f7);

    public static native void hover(long j10, int i10, float f7, float f10, int i11);

    public static native void repaint(long j10);

    public static native void theme(long j10, byte[] bArr);

    public static native void tick(long j10, float f7, boolean z10, boolean z11, boolean z12);

    public static native void touch(long j10, int i10, float f7, float f10, int i11, boolean z10, boolean z11, int i12, int i13);

    public static native void visible(long j10, boolean z10);

    public static native void width(long j10, float f7);
}
