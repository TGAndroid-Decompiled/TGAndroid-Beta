package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.et;
public final class z0 {
    public final int f43448a;
    public final String f43449b;
    public final m0 f43450c;
    public boolean d;
    public boolean f43451e;
    public String f43452f;
    public int f43453g;
    public int h;
    public int f43455j;
    public rc.u f43456k;
    public long f43457l;
    public int f43454i = -1;
    public final w0 f43458m = new Runnable(this) {
        public final z0 f43286b;

        {
            this.f43286b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43286b.e();
                    return;
                case 1:
                    z0 z0Var = this.f43286b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43286b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f43459n = new Runnable(this) {
        public final z0 f43286b;

        {
            this.f43286b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43286b.e();
                    return;
                case 1:
                    z0 z0Var = this.f43286b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43286b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f43460o = new Runnable(this) {
        public final z0 f43286b;

        {
            this.f43286b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43286b.e();
                    return;
                case 1:
                    z0 z0Var = this.f43286b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43286b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final et f43461p = new et(this, 23);

    public z0(int i7, String str, m0 m0Var) {
        this.f43448a = i7;
        this.f43449b = str;
        this.f43450c = m0Var;
    }

    public static String a(rc.v vVar) {
        String str;
        com.google.android.gms.internal.clearcut.z0 z0Var;
        switch (vVar.f54503a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case 30:
                str = "FRAME_MASKED";
                break;
            case 31:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if ((vVar instanceof rc.n) && (z0Var = ((rc.n) vVar).f54462b) != null) {
            StringBuilder j3 = rf.b.j(str, ", HTTP ");
            j3.append(z0Var.f7297b);
            return j3.toString();
        }
        return str;
    }

    public final void b() {
        boolean z9;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f43456k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        sb2.append(z9);
        sb2.append(", subscribed=");
        sb2.append(this.f43451e);
        sb2.append(", URL request=");
        sb2.append(this.f43454i);
        d(sb2.toString());
        this.h++;
        this.f43451e = false;
        org.telegram.messenger.g0.r(this.f43458m);
        org.telegram.messenger.g0.r(this.f43459n);
        org.telegram.messenger.g0.r(this.f43460o);
        org.telegram.messenger.g0.r(this.f43461p);
        if (this.f43454i >= 0) {
            ConnectionsManager.getInstance(this.f43448a).cancelRequest(this.f43454i, true);
            this.f43454i = -1;
        }
        rc.u uVar = this.f43456k;
        this.f43456k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(rc.u uVar, int i7) {
        if (this.d && this.f43456k == uVar && this.h == i7) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        org.telegram.messenger.a8.b("[gram-wallet-streaming] account=" + this.f43448a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        org.telegram.messenger.g0.r(this.f43458m);
        final int i7 = this.h + 1;
        this.h = i7;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f43455j);
        org.telegram.messenger.g0.i3(this.f43460o, 30000L);
        this.f43454i = ConnectionsManager.getInstance(this.f43448a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new d3.b(1), new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                z0 z0Var = z0.this;
                int i10 = i7;
                long j3 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (z0Var.d && z0Var.h == i10) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    z0Var.d(sb2.toString());
                    z0Var.f43454i = -1;
                    org.telegram.messenger.g0.r(z0Var.f43460o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(z0Var.f43448a).getCurrentTime()) * 1000;
                        z0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            z0Var.f("received expired streaming URL");
                            return;
                        }
                        org.telegram.messenger.g0.i3(z0Var.f43459n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        z0Var.d("opening websocket; attempt=" + i10);
                        try {
                            f5.u uVar = new f5.u(16, (short) 0);
                            uVar.f11190b = 10000;
                            rc.u h = uVar.h(str);
                            z0Var.f43456k = h;
                            y0 y0Var = new y0(z0Var, i10, elapsedRealtime2);
                            ab.q qVar = h.d;
                            synchronized (((ArrayList) qVar.f991c)) {
                                ((ArrayList) qVar.f991c).add(y0Var);
                                qVar.f989a = true;
                            }
                            org.telegram.messenger.g0.i3(z0Var.f43460o, 30000L);
                            rc.u uVar2 = z0Var.f43456k;
                            uVar2.getClass();
                            rc.b bVar = new rc.b("ConnectThread", uVar2, 3, 0);
                            ab.q qVar2 = uVar2.d;
                            if (qVar2 != null) {
                                ArrayList arrayList = (ArrayList) qVar2.p();
                                int size = arrayList.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    y0 y0Var2 = (y0) obj3;
                                    try {
                                        try {
                                            y0Var2.getClass();
                                        } catch (Throwable unused) {
                                            y0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e10) {
                            z0Var.f("could not open websocket: ".concat(e10.getClass().getSimpleName()));
                            return;
                        }
                    }
                    z0Var.f("could not obtain streaming URL");
                    return;
                }
                z0Var.d("ignoring stale URL response; attempt=" + i10);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i7 = this.f43455j;
        this.f43455j = i7 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i7, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        org.telegram.messenger.g0.i3(this.f43458m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        rc.u uVar = this.f43456k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f54506a = true;
        obj.f54509e = 1;
        if (str != null && str.length() != 0) {
            obj.c(rc.k.a(str));
        } else {
            obj.f54511g = null;
        }
        uVar.g(obj);
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        d("stopping");
        this.d = false;
        b();
    }
}
