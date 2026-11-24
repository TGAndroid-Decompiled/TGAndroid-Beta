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
public final class d0 extends n39 {
    public final Context c;
    public boolean d = true;
    public final ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
    public final void t(s49 s49Var, int i) {
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
        int i15 = s49Var.f;
        View view = s49Var.a;
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
                                                        vl7 vl7Var = (vl7) view;
                                                        i13 = themeActivity.nightThemeRow;
                                                        if (i != i13) {
                                                            i14 = themeActivity.browserRow;
                                                            if (i == i14) {
                                                                vl7Var.b(k96.M0(2131749017, null), k96.M0(2131749016, null), 2131232034, themeActivity.getMessagesController().M2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (bkb.o != 0) {
                                                            z2 = true;
                                                        }
                                                        if (z2) {
                                                            M03 = bkb.A0();
                                                        } else {
                                                            M03 = k96.M0(2131753780, "AutoNightThemeOff");
                                                        }
                                                        if (z2) {
                                                            int i16 = bkb.o;
                                                            if (i16 == 1) {
                                                                M04 = k96.M0(2131753784, "AutoNightScheduled");
                                                            } else if (i16 == 3) {
                                                                M04 = k96.M0(2131753783, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = k96.M0(2131753793, "AutoNightAdaptive");
                                                            }
                                                            M03 = tb4.y(M04, " ", M03);
                                                        }
                                                        vl7Var.b(k96.M0(2131753781, "AutoNightTheme"), M03, 2131231847, z2, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.c.A1(themeActivity.b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        o39 o39Var = (o39) view;
                                                        e0 e0Var = (e0) o39Var.getAdapter();
                                                        e0Var.f();
                                                        int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                                                        if (indexOf == -1) {
                                                            indexOf = e0Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((t26) o39Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - gl.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((d08) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        uy8 uy8Var = (uy8) view;
                                        if (i == themeActivity.I) {
                                            uy8Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            uy8Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((hc3) view).a();
                                    return;
                                }
                                wgb wgbVar = (wgb) view;
                                wgbVar.w = (byte) 48;
                                i8 = themeActivity.backgroundRow;
                                if (i == i8) {
                                    wgbVar.setSubtitle(null);
                                    int i17 = bkb.p6;
                                    wgbVar.g(i17, i17);
                                    String M05 = k96.M0(2131752538, null);
                                    i12 = themeActivity.changeUserColor;
                                    if (i12 >= 0) {
                                        z2 = true;
                                    }
                                    wgbVar.o(2131232071, M05, z2);
                                    return;
                                } else if (i != themeActivity.z0) {
                                    i9 = themeActivity.createNewThemeRow;
                                    if (i != i9) {
                                        i10 = themeActivity.liteModeRow;
                                        if (i != i10) {
                                            i11 = themeActivity.stickersRow;
                                            if (i == i11) {
                                                wgbVar.g(bkb.I5, bkb.F6);
                                                wgbVar.o(2131232043, k96.M0(2131744620, null), true);
                                                wgbVar.setSubtitle(k96.M0(2131744619, null));
                                                wgbVar.s = 64;
                                                wgbVar.w = (byte) 60;
                                                wgbVar.x = 20;
                                                return;
                                            } else if (i == themeActivity.B0) {
                                                wgbVar.g(bkb.I5, bkb.F6);
                                                wgbVar.o(2131232042, k96.M0(2131745039, null), false);
                                                wgbVar.setSubtitle(k96.M0(2131745040, null));
                                                wgbVar.s = 64;
                                                wgbVar.w = (byte) 60;
                                                wgbVar.x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        wgbVar.g(bkb.I5, bkb.F6);
                                        wgbVar.o(2131232019, k96.M0(2131748674, null), true);
                                        wgbVar.setSubtitle(k96.M0(2131748673, null));
                                        wgbVar.w = (byte) 60;
                                        wgbVar.s = 64;
                                        wgbVar.x = 20;
                                        return;
                                    }
                                    wgbVar.setSubtitle(null);
                                    int i18 = bkb.p6;
                                    wgbVar.g(i18, i18);
                                    wgbVar.o(2131232102, k96.M0(2131751700, null), false);
                                    return;
                                } else {
                                    wgbVar.setSubtitle(null);
                                    int i19 = bkb.p6;
                                    wgbVar.g(i19, i19);
                                    wgbVar.o(2131232405, k96.M0(2131751269, null), true);
                                    return;
                                }
                            }
                            ahb ahbVar = (ahb) view;
                            if (i == themeActivity.Y) {
                                ahbVar.f(k96.M0(2131753788, "AutoNightLocation"), bkb.p, true);
                                return;
                            } else if (i == themeActivity.O) {
                                ahbVar.f(k96.M0(2131751145, "EnableAnimations"), na7.c1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i == themeActivity.H) {
                                ahbVar.f(k96.M0(2131745440, "SendByEnter"), na7.c1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i != themeActivity.F) {
                                i4 = themeActivity.raiseToListenRow;
                                if (i == i4) {
                                    ahbVar.g(k96.M0(2131746234, "RaiseToListen"), k96.M0(2131746233, "RaiseToListenInfo"), gba.p0, true, true);
                                    return;
                                } else if (i != themeActivity.G) {
                                    i5 = themeActivity.pauseOnRecordRow;
                                    if (i != i5) {
                                        i6 = themeActivity.pauseOnMediaRow;
                                        if (i == i6) {
                                            ahbVar.f(k96.M0(2131747239, null), gba.C0, true);
                                            return;
                                        } else if (i != themeActivity.E) {
                                            i7 = themeActivity.sensitiveContentRow;
                                            if (i == i7) {
                                                ahbVar.g(k96.M0(2131745138, null), k96.M0(2131745137, null), themeActivity.getMessagesController().Y4(), true, true);
                                                return;
                                            } else if (i == themeActivity.t0) {
                                                ahbVar.f(k96.M0(2131753672, "BlurInChat"), gba.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            ahbVar.g(k96.M0(2131751426, "DirectShare"), k96.M0(2131751425, "DirectShareInfo"), gba.u0, false, true);
                                            return;
                                        }
                                    }
                                    ahbVar.g(k96.M0(2131747238, null), k96.M0(2131747237, "PauseMusicOnRecordInfo"), gba.B0, true, true);
                                    return;
                                } else {
                                    ahbVar.g(k96.M0(2131748057, "NextMediaTap"), k96.M0(2131748056, "NextMediaTapInfo"), gba.q0, true, true);
                                    return;
                                }
                            } else {
                                ahbVar.g(k96.M0(2131746232, "RaiseToSpeak"), k96.M0(2131746231, "RaiseToSpeakInfo"), gba.o0, true, true);
                                return;
                            }
                        }
                        ((uy0) view).setProgress(bkb.q);
                        return;
                    }
                    ld5 ld5Var = (ld5) view;
                    if (i == themeActivity.X) {
                        ld5Var.setText(k96.M0(2131753785, "AutoNightSchedule"));
                        return;
                    } else if (i == themeActivity.e0) {
                        ld5Var.setText(k96.M0(2131753792, "AutoNightBrightness"));
                        return;
                    } else if (i == themeActivity.h0) {
                        ld5Var.setText(k96.M0(2131753786, "AutoNightPreferred"));
                        return;
                    } else if (i == themeActivity.y) {
                        ld5Var.setText(k96.M0(2131745791, "SETTINGS"));
                        return;
                    } else if (i == themeActivity.j0) {
                        if (themeActivity.f == 3) {
                            ld5Var.setText(k96.M0(2131752827, "BuildMyOwnTheme"));
                            return;
                        } else {
                            ld5Var.setText(k96.M0(2131751999, "ColorTheme"));
                            return;
                        }
                    } else if (i == themeActivity.x) {
                        ld5Var.setText(k96.M0(2131743950, "TextSizeHeader"));
                        return;
                    } else if (i == themeActivity.m0) {
                        ld5Var.setText(k96.M0(2131752213, "ChatList"));
                        return;
                    } else if (i == themeActivity.k0) {
                        ld5Var.setText(k96.M0(2131752828, "BubbleRadius"));
                        return;
                    } else if (i == themeActivity.u0) {
                        ld5Var.setText(k96.M0(2131752210, "ChatListSwipeGesture"));
                        return;
                    } else if (i == themeActivity.x0) {
                        ld5Var.setText(k96.M0(2131745459, "SelectTheme"));
                        return;
                    } else if (i == themeActivity.J0) {
                        ld5Var.setText(k96.M0(2131754237, null));
                        return;
                    } else if (i == themeActivity.H0) {
                        ld5Var.setText(k96.M0(2131747572, "OtherSettings"));
                        return;
                    } else if (i == themeActivity.G0) {
                        ld5Var.setText(k96.M0(2131748468, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                bnb bnbVar = (bnb) view;
                if (i == themeActivity.S) {
                    String M06 = k96.M0(2131753790, "AutoNightDisabled");
                    if (bkb.o == 0) {
                        z2 = true;
                    }
                    bnbVar.a(M06, z2, true);
                    return;
                } else if (i == themeActivity.T) {
                    String M07 = k96.M0(2131753784, "AutoNightScheduled");
                    if (bkb.o == 1) {
                        z2 = true;
                    }
                    bnbVar.a(M07, z2, true);
                    return;
                } else if (i == themeActivity.U) {
                    String M08 = k96.M0(2131753793, "AutoNightAdaptive");
                    if (bkb.o == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (themeActivity.V != -1) {
                        z2 = true;
                    }
                    bnbVar.a(M08, z, z2);
                    return;
                } else if (i == themeActivity.V) {
                    String M09 = k96.M0(2131753783, "AutoNightSystemDefault");
                    if (bkb.o != 3) {
                        z3 = false;
                    }
                    bnbVar.a(M09, z3, false);
                    return;
                } else {
                    return;
                }
            }
            mhb mhbVar = (mhb) view;
            mhbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                mhbVar.setText(k96.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (bkb.q * 100.0f))));
                return;
            } else if (i == themeActivity.a0) {
                mhbVar.setText(ThemeActivity.w0());
                return;
            } else if (i == themeActivity.w0) {
                mhbVar.setText(k96.M0(2131752209, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                mhbVar.setText(k96.M0(2131748673, "LiteModeInfo"));
                return;
            } else {
                mhbVar.setFixedSize(12);
                mhbVar.setText("");
                return;
            }
        }
        uib uibVar = (uib) view;
        i2 = themeActivity.nightThemeRow;
        if (i == i2) {
            if (bkb.o != 0 && bkb.J != null) {
                uibVar.c(k96.M0(2131753781, null), bkb.A0(), false, false);
            } else {
                uibVar.c(k96.M0(2131753781, null), k96.M0(2131753780, null), false, false);
            }
        } else if (i == themeActivity.b0) {
            int i20 = bkb.r;
            int i21 = i20 / 60;
            uibVar.c(k96.M0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i20 - (i21 * 60))), false, true);
        } else if (i == themeActivity.c0) {
            int i22 = bkb.s;
            int i23 = i22 / 60;
            uibVar.c(k96.M0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i22 - (i23 * 60))), false, false);
        } else if (i == themeActivity.Z) {
            uibVar.c(k96.M0(2131753778, "AutoNightUpdateLocation"), bkb.w, false, false);
        } else if (i == themeActivity.R) {
            int i24 = na7.c1().getInt("sortContactsBy", 0);
            if (i24 == 0) {
                M02 = k96.M0(2131751588, "Default");
            } else if (i24 == 1) {
                M02 = k96.M0(2131745095, "FirstName");
            } else {
                M02 = k96.M0(2131745094, "LastName");
            }
            uibVar.c(k96.M0(2131745099, "SortBy"), M02, false, true);
        } else if (i == themeActivity.Q) {
            uibVar.b(k96.M0(2131749072, "ImportContacts"), true);
        } else if (i == themeActivity.L) {
            int i25 = gba.o1;
            if (i25 == 0) {
                M0 = k96.M0(2131751354, "DistanceUnitsAutomatic");
            } else if (i25 == 1) {
                M0 = k96.M0(2131751353, "DistanceUnitsKilometers");
            } else {
                M0 = k96.M0(2131751352, "DistanceUnitsMiles");
            }
            String M010 = k96.M0(2131751355, "DistanceUnits");
            boolean z4 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z3 = false;
            }
            uibVar.c(M010, M0, z4, z3);
            themeActivity.Q0 = false;
        } else if (i == themeActivity.M) {
            uibVar.c(k96.M0(2131745607, null), is9.a().a, themeActivity.R0, false);
        } else if (i == themeActivity.N) {
            String M011 = k96.M0(2131748247, null);
            if (gba.r0) {
                i3 = 2131748245;
            } else {
                i3 = 2131748246;
            }
            uibVar.c(M011, k96.M0(i3, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ?? frameLayout;
        int i2;
        int i3;
        float f;
        rkb rkbVar;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        ui5 ui5Var;
        int i7;
        int i8;
        int i9 = 3;
        float f2 = 21.0f;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                rkbVar = new uib(context);
                break;
            case 2:
                rkbVar = new mhb(context);
                break;
            case 3:
                rkbVar = new b9a(context, (de9) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                zkb.X(textView, bkb.F6, null);
                ug8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (k96.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView.setGravity(i2 | 16);
                boolean z3 = k96.a0;
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
                frameLayout.addView(textView, nme.d(-1, -1.0f, i10, f, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.b = imageView;
                zkb.s(imageView, bkb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232760);
                if (!k96.a0) {
                    i9 = 5;
                }
                frameLayout.addView(imageView, nme.d(19, 14.0f, i9 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                rkbVar = frameLayout;
                break;
            case 5:
                rkbVar = new ld5(context);
                break;
            case 6:
                rkbVar = new okb(this, context);
                break;
            case 7:
                rkbVar = new ahb(context);
                break;
            case 8:
                rkbVar = new skb(themeActivity, context);
                break;
            case 9:
                frameLayout = new pkb(context, (byte) 0);
                frameLayout.b = new z92[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(gl.L(21.0f), gl.L(10.0f), gl.L(21.0f), 0);
                int i11 = 0;
                while (true) {
                    z92[] z92VarArr = (z92[]) frameLayout.b;
                    if (i11 < z92VarArr.length) {
                        if (i11 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z92 z92Var = new z92(context, (byte) 0);
                        z92Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        z92Var.e = textPaint;
                        z92Var.setWillNotDraw(false);
                        z92Var.c = z;
                        if (z) {
                            i4 = 2131752211;
                        } else {
                            i4 = 2131752212;
                        }
                        z92Var.setContentDescription(k96.M0(i4, null));
                        textPaint.setTextSize(gl.L(13.0f));
                        y92 y92Var = new y92(z92Var, context);
                        z92Var.d = y92Var;
                        y92Var.setSize(gl.L(20.0f));
                        z92Var.addView(y92Var, nme.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z4 = gba.l1;
                        if (!z ? !z4 : z4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        y92Var.a(z2, false);
                        z92VarArr[i11] = z92Var;
                        z92 z92Var2 = ((z92[]) frameLayout.b)[i11];
                        if (i11 == 1) {
                            i5 = 10;
                        } else {
                            i5 = 0;
                        }
                        frameLayout.addView(z92Var2, nme.m(0.5f, -1, -1, i5, 0, 0));
                        ((z92[]) frameLayout.b)[i11].setOnClickListener(new v6((byte) 3, frameLayout, z));
                        i11++;
                    } else {
                        rkbVar = frameLayout;
                        break;
                    }
                }
            case 10:
                rkbVar = new vl7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                qkb qkbVar = new qkb(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = qkbVar;
                qkbVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new e49(-1, gl.L(148.0f)));
                rkbVar = view;
                break;
            case 12:
                final rkb rkbVar2 = new rkb(context, null, (byte) 0);
                rkbVar2.setFocusable(false);
                rkbVar2.setItemAnimator(null);
                rkbVar2.setLayoutAnimation(null);
                rkbVar2.setPadding(gl.L(11.0f), 0, gl.L(11.0f), 0);
                rkbVar2.setClipToPadding(false);
                t26 t26Var = new t26();
                t26Var.i1(0);
                rkbVar2.setLayoutManager(t26Var);
                final e0 e0Var = new e0(themeActivity, context);
                rkbVar2.setAdapter(e0Var);
                rkbVar2.setOnItemClickListener(new c39() {
                    @Override
                    public final void d(int i12, View view2) {
                        akb B0;
                        boolean z5;
                        boolean z6;
                        boolean z7;
                        boolean z8;
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b = themeActivity2.f;
                        if (b == 1) {
                            B0 = bkb.J;
                        } else {
                            B0 = bkb.B0();
                        }
                        akb akbVar = B0;
                        e0 e0Var2 = e0Var;
                        if (i12 == e0Var2.b() - 1) {
                            if (b == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            themeActivity2.presentFragment(new qmb(akbVar, false, 1, false, z8));
                        } else {
                            zjb zjbVar = (zjb) e0Var2.e.get(i12);
                            int i13 = akbVar.Z;
                            int i14 = zjbVar.a;
                            if (i13 != i14) {
                                if (b == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                bkb.I1(akbVar, z7, i14, view2);
                                jy3.q(akbVar, zjbVar.a);
                                bkb.K1(themeActivity2);
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
                                themeActivity2.presentFragment(new qmb(akbVar, false, 1, z5, z6));
                            }
                        }
                        int left = view2.getLeft();
                        int right = view2.getRight();
                        int L = gl.L(52.0f);
                        int i15 = left - L;
                        rkb rkbVar3 = rkbVar2;
                        if (i15 < 0) {
                            rkbVar3.x0(i15, 0, null);
                        } else {
                            int i16 = right + L;
                            if (i16 > rkbVar3.getMeasuredWidth()) {
                                rkbVar3.x0(i16 - rkbVar3.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = rkbVar3.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt = rkbVar3.getChildAt(i17);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                rkbVar2.setOnItemLongClickListener(new kq8(this, e0Var, (byte) 25));
                rkbVar2.setLayoutParams(new e49(-1, gl.L(62.0f)));
                rkbVar = rkbVar2;
                break;
            case 13:
                rkbVar = new mkb(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                rkbVar = new wgb(context);
                break;
            case 15:
                i6 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                rkbVar = new pcb(context, i6);
                break;
            case 16:
                ui5Var = ((org.telegram.ui.ActionBar.d) themeActivity).parentLayout;
                View o08Var = new o08(context, ui5Var, 0);
                o08Var.setImportantForAccessibility(4);
                rkbVar = o08Var;
                break;
            case 17:
                View hc3Var = new hc3(context, themeActivity, themeActivity.f);
                hc3Var.setFocusable(false);
                hc3Var.setLayoutParams(new e49(-1, -2));
                rkbVar = hc3Var;
                break;
            case 19:
                rkbVar = new uy8(context, false);
                break;
            case 20:
                i7 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                ?? o39Var = new o39(context, null);
                o39Var.f3 = new ArrayList();
                o39Var.h3 = i7;
                o39Var.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
                o39Var.setFocusable(false);
                o39Var.setItemAnimator(null);
                o39Var.setLayoutAnimation(null);
                t26 t26Var2 = new t26(0, false);
                o39Var.g3 = t26Var2;
                o39Var.setLayoutManager(t26Var2);
                o39Var.setAdapter(new jr(o39Var, (byte) 0));
                o39Var.i(new kr(o39Var, (byte) 0));
                o39Var.setOnItemClickListener(new ir((Object) o39Var, themeActivity, context, (byte) 0));
                o39Var.z1();
                rkbVar = o39Var;
                break;
            case 21:
                i8 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                rkbVar = new d08(i8, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new s49(rkbVar);
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z;
        if (s49Var.f == 4) {
            bnb bnbVar = (bnb) s49Var.a;
            if (s49Var.b() == bkb.o) {
                z = true;
            } else {
                z = false;
            }
            bnbVar.setTypeChecked(z);
        }
    }
}
