package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class d0 extends c79 {
    public final Context c;
    public boolean d = true;
    public final ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.L0;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ThemeActivity themeActivity = this.e;
        if (i != themeActivity.b0 && i != themeActivity.L && i != themeActivity.c0 && i != themeActivity.Z && i != themeActivity.Q && i != themeActivity.R && i != themeActivity.N && i != themeActivity.M) {
            if (i != themeActivity.g0 && i != themeActivity.a0 && i != themeActivity.w0 && i != themeActivity.C0 && i != themeActivity.I0) {
                if (i != themeActivity.s0 && i != themeActivity.W && i != themeActivity.d0 && i != themeActivity.P && i != themeActivity.i0 && i != themeActivity.o0 && i != themeActivity.l0 && i != themeActivity.K && i != themeActivity.K0 && i != themeActivity.A0 && i != themeActivity.D0 && i != themeActivity.E0 && i != themeActivity.F0) {
                    if (i != themeActivity.S && i != themeActivity.T && i != themeActivity.U && i != themeActivity.V) {
                        if (i != themeActivity.X && i != themeActivity.e0 && i != themeActivity.h0 && i != themeActivity.y && i != themeActivity.j0 && i != themeActivity.x && i != themeActivity.m0 && i != themeActivity.k0 && i != themeActivity.u0 && i != themeActivity.x0 && i != themeActivity.J0 && i != themeActivity.G0 && i != themeActivity.H0) {
                            if (i == themeActivity.f0) {
                                return 6;
                            }
                            if (i != themeActivity.Y && i != themeActivity.H && i != themeActivity.F) {
                                i2 = themeActivity.raiseToListenRow;
                                if (i != i2) {
                                    i3 = themeActivity.pauseOnRecordRow;
                                    if (i != i3 && i != themeActivity.E && i != themeActivity.t0) {
                                        i4 = themeActivity.pauseOnMediaRow;
                                        if (i != i4 && i != themeActivity.G) {
                                            i5 = themeActivity.sensitiveContentRow;
                                            if (i != i5) {
                                                i6 = themeActivity.textSizeRow;
                                                if (i == i6) {
                                                    return 8;
                                                }
                                                if (i != themeActivity.n0) {
                                                    i7 = themeActivity.nightThemeRow;
                                                    if (i != i7) {
                                                        i8 = themeActivity.browserRow;
                                                        if (i != i8) {
                                                            if (i == themeActivity.p0) {
                                                                return 11;
                                                            }
                                                            if (i != themeActivity.r0) {
                                                                i9 = themeActivity.bubbleRadiusRow;
                                                                if (i != i9) {
                                                                    i10 = themeActivity.backgroundRow;
                                                                    if (i != i10 && i != themeActivity.z0) {
                                                                        i11 = themeActivity.createNewThemeRow;
                                                                        if (i != i11) {
                                                                            i12 = themeActivity.liteModeRow;
                                                                            if (i != i12) {
                                                                                i13 = themeActivity.stickersRow;
                                                                                if (i != i13 && i != themeActivity.B0) {
                                                                                    if (i == themeActivity.v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i == themeActivity.y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i == themeActivity.q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i != themeActivity.I && i != themeActivity.J) {
                                                                                        i14 = themeActivity.appIconSelectorRow;
                                                                                        if (i != i14) {
                                                                                            i15 = themeActivity.changeUserColor;
                                                                                            if (i == i15) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        String M0;
        String M02;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String M03;
        String M04;
        int i15 = f89Var.f;
        View view = f89Var.a;
        ThemeActivity themeActivity = this.e;
        boolean z2 = false;
        boolean z3 = true;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 != 7) {
                                if (i15 != 14) {
                                    if (i15 != 17) {
                                        if (i15 != 19) {
                                            if (i15 != 21) {
                                                switch (i15) {
                                                    case 10:
                                                        uo7 uo7Var = (uo7) view;
                                                        i13 = themeActivity.nightThemeRow;
                                                        if (i != i13) {
                                                            i14 = themeActivity.browserRow;
                                                            if (i == i14) {
                                                                uo7Var.b(ob6.M0(2131748963, null), ob6.M0(2131748962, null), 2131232034, themeActivity.getMessagesController().S2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (aob.o != 0) {
                                                            z2 = true;
                                                        }
                                                        if (z2) {
                                                            M03 = aob.A0();
                                                        } else {
                                                            M03 = ob6.M0(2131753776, "AutoNightThemeOff");
                                                        }
                                                        if (z2) {
                                                            int i16 = aob.o;
                                                            if (i16 == 1) {
                                                                M04 = ob6.M0(2131753780, "AutoNightScheduled");
                                                            } else if (i16 == 3) {
                                                                M04 = ob6.M0(2131753779, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = ob6.M0(2131753789, "AutoNightAdaptive");
                                                            }
                                                            M03 = qd4.y(M04, " ", M03);
                                                        }
                                                        uo7Var.b(ob6.M0(2131753777, "AutoNightTheme"), M03, 2131231847, z2, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.c.B1(themeActivity.b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        d79 d79Var = (d79) view;
                                                        e0 e0Var = (e0) d79Var.getAdapter();
                                                        e0Var.f();
                                                        int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                                                        if (indexOf == -1) {
                                                            indexOf = e0Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((x46) d79Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - hl.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((j38) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        h29 h29Var = (h29) view;
                                        if (i == themeActivity.I) {
                                            h29Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            h29Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((ad3) view).a();
                                    return;
                                }
                                skb skbVar = (skb) view;
                                skbVar.w = (byte) 48;
                                i8 = themeActivity.backgroundRow;
                                if (i == i8) {
                                    skbVar.setSubtitle(null);
                                    int i17 = aob.q6;
                                    skbVar.g(i17, i17);
                                    String M05 = ob6.M0(2131752531, null);
                                    i12 = themeActivity.changeUserColor;
                                    if (i12 >= 0) {
                                        z2 = true;
                                    }
                                    skbVar.o(2131232071, M05, z2);
                                    return;
                                } else if (i != themeActivity.z0) {
                                    i9 = themeActivity.createNewThemeRow;
                                    if (i != i9) {
                                        i10 = themeActivity.liteModeRow;
                                        if (i != i10) {
                                            i11 = themeActivity.stickersRow;
                                            if (i == i11) {
                                                skbVar.g(aob.J5, aob.G6);
                                                skbVar.o(2131232043, ob6.M0(2131744514, null), true);
                                                skbVar.setSubtitle(ob6.M0(2131744513, null));
                                                skbVar.s = 64;
                                                skbVar.w = (byte) 60;
                                                skbVar.x = 20;
                                                return;
                                            } else if (i == themeActivity.B0) {
                                                skbVar.g(aob.J5, aob.G6);
                                                skbVar.o(2131232042, ob6.M0(2131744958, null), false);
                                                skbVar.setSubtitle(ob6.M0(2131744984, null));
                                                skbVar.s = 64;
                                                skbVar.w = (byte) 60;
                                                skbVar.x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        skbVar.g(aob.J5, aob.G6);
                                        skbVar.o(2131232019, ob6.M0(2131748620, null), true);
                                        skbVar.setSubtitle(ob6.M0(2131748619, null));
                                        skbVar.w = (byte) 60;
                                        skbVar.s = 64;
                                        skbVar.x = 20;
                                        return;
                                    }
                                    skbVar.setSubtitle(null);
                                    int i18 = aob.q6;
                                    skbVar.g(i18, i18);
                                    skbVar.o(2131232102, ob6.M0(2131751677, null), false);
                                    return;
                                } else {
                                    skbVar.setSubtitle(null);
                                    int i19 = aob.q6;
                                    skbVar.g(i19, i19);
                                    skbVar.o(2131232405, ob6.M0(2131751246, null), true);
                                    return;
                                }
                            }
                            wkb wkbVar = (wkb) view;
                            if (i == themeActivity.Y) {
                                wkbVar.f(ob6.M0(2131753784, "AutoNightLocation"), aob.p, true);
                                return;
                            } else if (i == themeActivity.O) {
                                wkbVar.f(ob6.M0(2131751122, "EnableAnimations"), uc7.e1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i == themeActivity.H) {
                                wkbVar.f(ob6.M0(2131745360, "SendByEnter"), uc7.e1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i != themeActivity.F) {
                                i4 = themeActivity.raiseToListenRow;
                                if (i == i4) {
                                    wkbVar.g(ob6.M0(2131746154, "RaiseToListen"), ob6.M0(2131746153, "RaiseToListenInfo"), xea.p0, true, true);
                                    return;
                                } else if (i != themeActivity.G) {
                                    i5 = themeActivity.pauseOnRecordRow;
                                    if (i != i5) {
                                        i6 = themeActivity.pauseOnMediaRow;
                                        if (i == i6) {
                                            wkbVar.f(ob6.M0(2131747159, null), xea.C0, true);
                                            return;
                                        } else if (i != themeActivity.E) {
                                            i7 = themeActivity.sensitiveContentRow;
                                            if (i == i7) {
                                                wkbVar.g(ob6.M0(2131745058, null), ob6.M0(2131745057, null), themeActivity.getMessagesController().g5(), true, true);
                                                return;
                                            } else if (i == themeActivity.t0) {
                                                wkbVar.f(ob6.M0(2131753668, "BlurInChat"), xea.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            wkbVar.g(ob6.M0(2131751403, "DirectShare"), ob6.M0(2131751402, "DirectShareInfo"), xea.u0, false, true);
                                            return;
                                        }
                                    }
                                    wkbVar.g(ob6.M0(2131747158, null), ob6.M0(2131747157, "PauseMusicOnRecordInfo"), xea.B0, true, true);
                                    return;
                                } else {
                                    wkbVar.g(ob6.M0(2131747980, "NextMediaTap"), ob6.M0(2131747979, "NextMediaTapInfo"), xea.q0, true, true);
                                    return;
                                }
                            } else {
                                wkbVar.g(ob6.M0(2131746152, "RaiseToSpeak"), ob6.M0(2131746151, "RaiseToSpeakInfo"), xea.o0, true, true);
                                return;
                            }
                        }
                        ((cz0) view).setProgress(aob.q);
                        return;
                    }
                    mf5 mf5Var = (mf5) view;
                    if (i == themeActivity.X) {
                        mf5Var.setText(ob6.M0(2131753781, "AutoNightSchedule"));
                        return;
                    } else if (i == themeActivity.e0) {
                        mf5Var.setText(ob6.M0(2131753788, "AutoNightBrightness"));
                        return;
                    } else if (i == themeActivity.h0) {
                        mf5Var.setText(ob6.M0(2131753782, "AutoNightPreferred"));
                        return;
                    } else if (i == themeActivity.y) {
                        mf5Var.setText(ob6.M0(2131745711, "SETTINGS"));
                        return;
                    } else if (i == themeActivity.j0) {
                        if (themeActivity.f == 3) {
                            mf5Var.setText(ob6.M0(2131752820, "BuildMyOwnTheme"));
                            return;
                        } else {
                            mf5Var.setText(ob6.M0(2131751976, "ColorTheme"));
                            return;
                        }
                    } else if (i == themeActivity.x) {
                        mf5Var.setText(ob6.M0(2131743844, "TextSizeHeader"));
                        return;
                    } else if (i == themeActivity.m0) {
                        mf5Var.setText(ob6.M0(2131752190, "ChatList"));
                        return;
                    } else if (i == themeActivity.k0) {
                        mf5Var.setText(ob6.M0(2131752821, "BubbleRadius"));
                        return;
                    } else if (i == themeActivity.u0) {
                        mf5Var.setText(ob6.M0(2131752187, "ChatListSwipeGesture"));
                        return;
                    } else if (i == themeActivity.x0) {
                        mf5Var.setText(ob6.M0(2131745379, "SelectTheme"));
                        return;
                    } else if (i == themeActivity.J0) {
                        mf5Var.setText(ob6.M0(2131754233, null));
                        return;
                    } else if (i == themeActivity.H0) {
                        mf5Var.setText(ob6.M0(2131747492, "OtherSettings"));
                        return;
                    } else if (i == themeActivity.G0) {
                        mf5Var.setText(ob6.M0(2131748414, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                arb arbVar = (arb) view;
                if (i == themeActivity.S) {
                    String M06 = ob6.M0(2131753786, "AutoNightDisabled");
                    if (aob.o == 0) {
                        z2 = true;
                    }
                    arbVar.a(M06, z2, true);
                    return;
                } else if (i == themeActivity.T) {
                    String M07 = ob6.M0(2131753780, "AutoNightScheduled");
                    if (aob.o == 1) {
                        z2 = true;
                    }
                    arbVar.a(M07, z2, true);
                    return;
                } else if (i == themeActivity.U) {
                    String M08 = ob6.M0(2131753789, "AutoNightAdaptive");
                    if (aob.o == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (themeActivity.V != -1) {
                        z2 = true;
                    }
                    arbVar.a(M08, z, z2);
                    return;
                } else if (i == themeActivity.V) {
                    String M09 = ob6.M0(2131753779, "AutoNightSystemDefault");
                    if (aob.o != 3) {
                        z3 = false;
                    }
                    arbVar.a(M09, z3, false);
                    return;
                } else {
                    return;
                }
            }
            ilb ilbVar = (ilb) view;
            ilbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                ilbVar.setText(ob6.a0("AutoNightBrightnessInfo", null, 2131753787, Integer.valueOf((int) (aob.q * 100.0f))));
                return;
            } else if (i == themeActivity.a0) {
                ilbVar.setText(ThemeActivity.x0());
                return;
            } else if (i == themeActivity.w0) {
                ilbVar.setText(ob6.M0(2131752186, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                ilbVar.setText(ob6.M0(2131748619, "LiteModeInfo"));
                return;
            } else {
                ilbVar.setFixedSize(12);
                ilbVar.setText("");
                return;
            }
        }
        qmb qmbVar = (qmb) view;
        i2 = themeActivity.nightThemeRow;
        if (i == i2) {
            if (aob.o != 0 && aob.J != null) {
                qmbVar.c(ob6.M0(2131753777, null), aob.A0(), false, false);
            } else {
                qmbVar.c(ob6.M0(2131753777, null), ob6.M0(2131753776, null), false, false);
            }
        } else if (i == themeActivity.b0) {
            int i20 = aob.r;
            int i21 = i20 / 60;
            qmbVar.c(ob6.M0(2131753785, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i20 - (i21 * 60))), false, true);
        } else if (i == themeActivity.c0) {
            int i22 = aob.s;
            int i23 = i22 / 60;
            qmbVar.c(ob6.M0(2131753775, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i22 - (i23 * 60))), false, false);
        } else if (i == themeActivity.Z) {
            qmbVar.c(ob6.M0(2131753774, "AutoNightUpdateLocation"), aob.w, false, false);
        } else if (i == themeActivity.R) {
            int i24 = uc7.e1().getInt("sortContactsBy", 0);
            if (i24 == 0) {
                M02 = ob6.M0(2131751565, "Default");
            } else if (i24 == 1) {
                M02 = ob6.M0(2131745015, "FirstName");
            } else {
                M02 = ob6.M0(2131745014, "LastName");
            }
            qmbVar.c(ob6.M0(2131745019, "SortBy"), M02, false, true);
        } else if (i == themeActivity.Q) {
            qmbVar.b(ob6.M0(2131749018, "ImportContacts"), true);
        } else if (i == themeActivity.L) {
            int i25 = xea.o1;
            if (i25 == 0) {
                M0 = ob6.M0(2131751331, "DistanceUnitsAutomatic");
            } else if (i25 == 1) {
                M0 = ob6.M0(2131751330, "DistanceUnitsKilometers");
            } else {
                M0 = ob6.M0(2131751329, "DistanceUnitsMiles");
            }
            String M010 = ob6.M0(2131751332, "DistanceUnits");
            boolean z4 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z3 = false;
            }
            qmbVar.c(M010, M0, z4, z3);
            themeActivity.Q0 = false;
        } else if (i == themeActivity.M) {
            qmbVar.c(ob6.M0(2131745527, null), bw9.a().a, themeActivity.R0, false);
        } else if (i == themeActivity.N) {
            String M011 = ob6.M0(2131748193, null);
            if (xea.r0) {
                i3 = 2131748191;
            } else {
                i3 = 2131748192;
            }
            qmbVar.c(M011, ob6.M0(i3, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ?? frameLayout;
        int i2;
        int i3;
        float f;
        qob qobVar;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        wk5 wk5Var;
        int i7;
        int i8;
        int i9 = 3;
        float f2 = 21.0f;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                qobVar = new qmb(context);
                break;
            case 2:
                qobVar = new ilb(context);
                break;
            case 3:
                qobVar = new rca(context, (uh9) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                yob.X(textView, aob.G6, null);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (ob6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                boolean z3 = ob6.a0;
                if (z3) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                int i10 = i3 | 48;
                if (z3) {
                    f = 71.0f;
                } else {
                    f = 21.0f;
                }
                if (!z3) {
                    f2 = 23.0f;
                }
                frameLayout.addView(textView, tre.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.b = imageView;
                yob.s(imageView, aob.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232778);
                if (!ob6.a0) {
                    i9 = 5;
                }
                frameLayout.addView(imageView, tre.d(19, 14.0f, i9 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                qobVar = frameLayout;
                break;
            case 5:
                qobVar = new mf5(context);
                break;
            case 6:
                qobVar = new nob(this, context);
                break;
            case 7:
                qobVar = new wkb(context);
                break;
            case 8:
                qobVar = new rob(themeActivity, context);
                break;
            case 9:
                frameLayout = new oob(context, (byte) 0);
                frameLayout.b = new pa2[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(hl.L(21.0f), hl.L(10.0f), hl.L(21.0f), 0);
                int i11 = 0;
                while (true) {
                    pa2[] pa2VarArr = (pa2[]) frameLayout.b;
                    if (i11 < pa2VarArr.length) {
                        if (i11 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pa2 pa2Var = new pa2(context, (byte) 0);
                        pa2Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        pa2Var.e = textPaint;
                        pa2Var.setWillNotDraw(false);
                        pa2Var.c = z;
                        if (z) {
                            i4 = 2131752188;
                        } else {
                            i4 = 2131752189;
                        }
                        pa2Var.setContentDescription(ob6.M0(i4, null));
                        textPaint.setTextSize(hl.L(13.0f));
                        oa2 oa2Var = new oa2(pa2Var, context);
                        pa2Var.d = oa2Var;
                        oa2Var.setSize(hl.L(20.0f));
                        pa2Var.addView(oa2Var, tre.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z4 = xea.l1;
                        if (!z ? !z4 : z4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        oa2Var.a(z2, false);
                        pa2VarArr[i11] = pa2Var;
                        pa2 pa2Var2 = ((pa2[]) frameLayout.b)[i11];
                        if (i11 == 1) {
                            i5 = 10;
                        } else {
                            i5 = 0;
                        }
                        frameLayout.addView(pa2Var2, tre.m(0.5f, -1, -1, i5, 0, 0));
                        ((pa2[]) frameLayout.b)[i11].setOnClickListener(new w6((byte) 3, frameLayout, z));
                        i11++;
                    } else {
                        qobVar = frameLayout;
                        break;
                    }
                }
            case 10:
                qobVar = new uo7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                pob pobVar = new pob(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = pobVar;
                pobVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new r79(-1, hl.L(148.0f)));
                qobVar = view;
                break;
            case 12:
                final qob qobVar2 = new qob(context, null, (byte) 0);
                qobVar2.setFocusable(false);
                qobVar2.setItemAnimator(null);
                qobVar2.setLayoutAnimation(null);
                qobVar2.setPadding(hl.L(11.0f), 0, hl.L(11.0f), 0);
                qobVar2.setClipToPadding(false);
                x46 x46Var = new x46();
                x46Var.i1(0);
                qobVar2.setLayoutManager(x46Var);
                final e0 e0Var = new e0(themeActivity, context);
                qobVar2.setAdapter(e0Var);
                qobVar2.setOnItemClickListener(new r69() {
                    @Override
                    public final void e(int i12, View view2) {
                        znb B0;
                        boolean z5;
                        boolean z6;
                        boolean z7;
                        boolean z8;
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b = themeActivity2.f;
                        if (b == 1) {
                            B0 = aob.J;
                        } else {
                            B0 = aob.B0();
                        }
                        znb znbVar = B0;
                        e0 e0Var2 = e0Var;
                        if (i12 == e0Var2.b() - 1) {
                            if (b == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            themeActivity2.presentFragment(new pqb(znbVar, false, 1, false, z8));
                        } else {
                            ynb ynbVar = (ynb) e0Var2.e.get(i12);
                            int i13 = znbVar.Z;
                            int i14 = ynbVar.a;
                            if (i13 != i14) {
                                if (b == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                aob.I1(znbVar, z7, i14, view2);
                                ez3.q(znbVar, ynbVar.a);
                                aob.K1(themeActivity2);
                            } else {
                                if (i14 >= 100) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (b == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                themeActivity2.presentFragment(new pqb(znbVar, false, 1, z5, z6));
                            }
                        }
                        int left = view2.getLeft();
                        int right = view2.getRight();
                        int L = hl.L(52.0f);
                        int i15 = left - L;
                        qob qobVar3 = qobVar2;
                        if (i15 < 0) {
                            qobVar3.y0(i15, 0, null);
                        } else {
                            int i16 = right + L;
                            if (i16 > qobVar3.getMeasuredWidth()) {
                                qobVar3.y0(i16 - qobVar3.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = qobVar3.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt = qobVar3.getChildAt(i17);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                qobVar2.setOnItemLongClickListener((t69) new yw9(this, e0Var, (byte) 11));
                qobVar2.setLayoutParams(new r79(-1, hl.L(62.0f)));
                qobVar = qobVar2;
                break;
            case 13:
                qobVar = new lob(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                qobVar = new skb(context);
                break;
            case 15:
                i6 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                qobVar = new lgb(context, i6);
                break;
            case 16:
                wk5Var = ((org.telegram.ui.ActionBar.e) themeActivity).parentLayout;
                View u38Var = new u38(context, wk5Var, 0);
                u38Var.setImportantForAccessibility(4);
                qobVar = u38Var;
                break;
            case 17:
                View ad3Var = new ad3(context, themeActivity, themeActivity.f);
                ad3Var.setFocusable(false);
                ad3Var.setLayoutParams(new r79(-1, -2));
                qobVar = ad3Var;
                break;
            case 19:
                qobVar = new h29(context, false);
                break;
            case 20:
                i7 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                ?? d79Var = new d79(context, null);
                d79Var.f3 = new ArrayList();
                d79Var.h3 = i7;
                d79Var.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
                d79Var.setFocusable(false);
                d79Var.setItemAnimator(null);
                d79Var.setLayoutAnimation(null);
                x46 x46Var2 = new x46(0, false);
                d79Var.g3 = x46Var2;
                d79Var.setLayoutManager(x46Var2);
                d79Var.setAdapter(new kr(d79Var, (byte) 0));
                d79Var.i(new lr(d79Var, (byte) 0));
                d79Var.setOnItemClickListener(new jr((Object) d79Var, themeActivity, context, (byte) 0));
                d79Var.A1();
                qobVar = d79Var;
                break;
            case 21:
                i8 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                qobVar = new j38(i8, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new f89(qobVar);
    }

    @Override
    public final void y(f89 f89Var) {
        boolean z;
        if (f89Var.f == 4) {
            arb arbVar = (arb) f89Var.a;
            if (f89Var.b() == aob.o) {
                z = true;
            } else {
                z = false;
            }
            arbVar.setTypeChecked(z);
        }
    }
}
