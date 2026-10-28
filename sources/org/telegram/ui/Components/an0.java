package org.telegram.ui.Components;

import android.view.PointerIcon;
import android.view.View;
public abstract class an0 {
    public static void a(View view, String str) {
        str.getClass();
        int i10 = 0;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1445472863:
                if (str.equals("col-resize")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1420126065:
                if (str.equals("se-resize")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1215869197:
                if (str.equals("n-resize")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1158137564:
                if (str.equals("vertical-text")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1091752114:
                if (str.equals("s-resize")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c10 = 5;
                    break;
                }
                break;
            case -972788342:
                if (str.equals("ne-resize")) {
                    c10 = 6;
                    break;
                }
                break;
            case -579752401:
                if (str.equals("ew-resize")) {
                    c10 = 7;
                    break;
                }
                break;
            case -400605635:
                if (str.equals("pointer")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -114311107:
                if (str.equals("sw-resize")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -110060193:
                if (str.equals("zoom-in")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3049826:
                if (str.equals("cell")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3181132:
                if (str.equals("grab")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3198785:
                if (str.equals("help")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3357649:
                if (str.equals("move")) {
                    c10 = 15;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c10 = 16;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c10 = 17;
                    break;
                }
                break;
            case 3641717:
                if (str.equals("wait")) {
                    c10 = 18;
                    break;
                }
                break;
            case 87599244:
                if (str.equals("grabbing")) {
                    c10 = 19;
                    break;
                }
                break;
            case 92902992:
                if (str.equals("alias")) {
                    c10 = 20;
                    break;
                }
                break;
            case 101707897:
                if (str.equals("all-scroll")) {
                    c10 = 21;
                    break;
                }
                break;
            case 278706972:
                if (str.equals("e-resize")) {
                    c10 = 22;
                    break;
                }
                break;
            case 333026616:
                if (str.equals("nw-resize")) {
                    c10 = 23;
                    break;
                }
                break;
            case 560073902:
                if (str.equals("not-allowed")) {
                    c10 = 24;
                    break;
                }
                break;
            case 868416742:
                if (str.equals("nwse-resize")) {
                    c10 = 25;
                    break;
                }
                break;
            case 883107412:
                if (str.equals("zoom-out")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1070544573:
                if (str.equals("context-menu")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1397962786:
                if (str.equals("crosshair")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1416507494:
                if (str.equals("nesw-resize")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1584521930:
                if (str.equals("w-resize")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1892836359:
                if (str.equals("row-resize")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951719868:
                if (str.equals("ns-resize")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2063643515:
                if (str.equals("no-drop")) {
                    c10 = '!';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 7:
            case 22:
            case 30:
                i10 = 1014;
                break;
            case 1:
            case 23:
            case 25:
                i10 = 1017;
                break;
            case 2:
            case 4:
            case 31:
            case ' ':
                i10 = 1015;
                break;
            case 3:
                i10 = 1009;
                break;
            case 5:
            case 18:
                i10 = 1004;
                break;
            case 6:
            case '\t':
            case 29:
                i10 = 1016;
                break;
            case '\b':
                i10 = 1002;
                break;
            case '\n':
                i10 = 1018;
                break;
            case 11:
                i10 = 1006;
                break;
            case '\f':
                i10 = 1011;
                break;
            case '\r':
                i10 = 1020;
                break;
            case 14:
                i10 = 1003;
                break;
            case 15:
            case 21:
                i10 = 1013;
                break;
            case 16:
                break;
            case 17:
                i10 = 1008;
                break;
            case 19:
                i10 = 1021;
                break;
            case 20:
                i10 = 1010;
                break;
            case 24:
            case '!':
                i10 = 1012;
                break;
            case 26:
                i10 = 1019;
                break;
            case 27:
                i10 = 1001;
                break;
            case 28:
                i10 = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i10));
    }
}
