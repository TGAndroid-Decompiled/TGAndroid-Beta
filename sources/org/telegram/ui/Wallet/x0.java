package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.lt;
public final class x0 {
    public final int f43370a;
    public final String f43371b;
    public final k0 f43372c;
    public boolean d;
    public boolean f43373e;
    public String f43374f;
    public int f43375g;
    public int h;
    public int f43377j;
    public oc.u f43378k;
    public long f43379l;
    public int f43376i = -1;
    public final u0 f43380m = new Runnable(this) {
        public final x0 f43214b;

        {
            this.f43214b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43214b.e();
                    return;
                case 1:
                    x0 x0Var = this.f43214b;
                    if (x0Var.d) {
                        x0Var.d("URL expired; renewing connection");
                        x0Var.b();
                        x0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43214b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final u0 f43381n = new Runnable(this) {
        public final x0 f43214b;

        {
            this.f43214b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43214b.e();
                    return;
                case 1:
                    x0 x0Var = this.f43214b;
                    if (x0Var.d) {
                        x0Var.d("URL expired; renewing connection");
                        x0Var.b();
                        x0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43214b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final u0 f43382o = new Runnable(this) {
        public final x0 f43214b;

        {
            this.f43214b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f43214b.e();
                    return;
                case 1:
                    x0 x0Var = this.f43214b;
                    if (x0Var.d) {
                        x0Var.d("URL expired; renewing connection");
                        x0Var.b();
                        x0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f43214b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final lt f43383p = new lt(this, 18);

    public x0(int i3, String str, k0 k0Var) {
        this.f43370a = i3;
        this.f43371b = str;
        this.f43372c = k0Var;
    }

    public static String a(oc.v vVar) {
        String str;
        ad.b bVar;
        switch (vVar.f21026a) {
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
        if ((vVar instanceof oc.n) && (bVar = ((oc.n) vVar).f20985b) != null) {
            StringBuilder h = t4.c.h(str, ", HTTP ");
            h.append(bVar.f316c);
            return h.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f43378k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.f43373e);
        sb2.append(", URL request=");
        sb2.append(this.f43376i);
        d(sb2.toString());
        this.h++;
        this.f43373e = false;
        org.telegram.messenger.g0.r(this.f43380m);
        org.telegram.messenger.g0.r(this.f43381n);
        org.telegram.messenger.g0.r(this.f43382o);
        org.telegram.messenger.g0.r(this.f43383p);
        if (this.f43376i >= 0) {
            ConnectionsManager.getInstance(this.f43370a).cancelRequest(this.f43376i, true);
            this.f43376i = -1;
        }
        oc.u uVar = this.f43378k;
        this.f43378k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(oc.u uVar, int i3) {
        if (this.d && this.f43378k == uVar && this.h == i3) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        org.telegram.messenger.a8.b("[gram-wallet-streaming] account=" + this.f43370a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        org.telegram.messenger.g0.r(this.f43380m);
        final int i3 = this.h + 1;
        this.h = i3;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f43377j);
        org.telegram.messenger.g0.i3(this.f43382o, 30000L);
        this.f43376i = ConnectionsManager.getInstance(this.f43370a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new c3.b(1), new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                x0 x0Var = x0.this;
                int i10 = i3;
                long j10 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (x0Var.d && x0Var.h == i10) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j10);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    x0Var.d(sb2.toString());
                    x0Var.f43376i = -1;
                    org.telegram.messenger.g0.r(x0Var.f43382o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(x0Var.f43370a).getCurrentTime()) * 1000;
                        x0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            x0Var.f("received expired streaming URL");
                            return;
                        }
                        org.telegram.messenger.g0.i3(x0Var.f43381n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        x0Var.d("opening websocket; attempt=" + i10);
                        try {
                            e5.u uVar = new e5.u(11, (short) 0);
                            uVar.f9633b = 10000;
                            oc.u f10 = uVar.f(str);
                            x0Var.f43378k = f10;
                            w0 w0Var = new w0(x0Var, i10, elapsedRealtime2);
                            b4.n nVar = f10.d;
                            synchronized (((ArrayList) nVar.f2379c)) {
                                ((ArrayList) nVar.f2379c).add(w0Var);
                                nVar.f2377a = true;
                            }
                            org.telegram.messenger.g0.i3(x0Var.f43382o, 30000L);
                            oc.u uVar2 = x0Var.f43378k;
                            uVar2.getClass();
                            oc.b bVar = new oc.b("ConnectThread", uVar2, 3, 0);
                            b4.n nVar2 = uVar2.d;
                            if (nVar2 != null) {
                                ArrayList arrayList = (ArrayList) nVar2.q();
                                int size = arrayList.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    w0 w0Var2 = (w0) obj3;
                                    try {
                                        try {
                                            w0Var2.getClass();
                                        } catch (Throwable unused) {
                                            w0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e10) {
                            x0Var.f("could not open websocket: ".concat(e10.getClass().getSimpleName()));
                            return;
                        }
                    }
                    x0Var.f("could not obtain streaming URL");
                    return;
                }
                x0Var.d("ignoring stale URL response; attempt=" + i10);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i3 = this.f43377j;
        this.f43377j = i3 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i3, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        org.telegram.messenger.g0.i3(this.f43380m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        oc.u uVar = this.f43378k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f21029a = true;
        obj.f21032e = 1;
        if (str != null && str.length() != 0) {
            obj.c(oc.k.a(str));
        } else {
            obj.f21034g = null;
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
