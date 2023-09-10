package org.telegram.ui.Components.Paint;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class ShaderSet {
    private static final Map<String, Map<String, Object>> AVAILABLE_SHADERS = createMap();

    private static Map<String, Map<String, Object>> createMap() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;attribute float alpha;varying vec2 varTexcoord;varying float varIntensity;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;   varIntensity = alpha;}");
        hashMap2.put("fragment", "precision highp float;varying vec2 varTexcoord;varying float varIntensity;uniform sampler2D texture;void main (void) {   gl_FragColor = vec4(1, 1, 1, varIntensity * texture2D(texture, varTexcoord.st, 0.0).r);}");
        hashMap2.put("attributes", new String[]{"inPosition", "inTexcoord", "alpha"});
        hashMap2.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("brush", Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap3.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;void main (void) {   gl_FragColor = texture2D(texture, varTexcoord.st, 0.0);   gl_FragColor.rgb *= gl_FragColor.a;}");
        hashMap3.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap3.put("uniforms", new String[]{"mvpMatrix", "texture", "alpha"});
        hashMap.put("blit", Collections.unmodifiableMap(hashMap3));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap4.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;   gl_FragColor.rgb *= gl_FragColor.a;}");
        hashMap4.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap4.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("blitWithMask", Collections.unmodifiableMap(hashMap4));
        HashMap hashMap5 = new HashMap();
        hashMap5.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap5.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main(void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;}");
        hashMap5.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap5.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("compositeWithMask", Collections.unmodifiableMap(hashMap5));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap6.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform sampler2D blured;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   vec4 blurColor = texture2D(blured, varTexcoord.st, 0.0);   gl_FragColor.rgb = (blurColor.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;   gl_FragColor.rgb *= gl_FragColor.a;}");
        hashMap6.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap6.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "blured", "color"});
        hashMap.put("blitWithMaskBlurer", Collections.unmodifiableMap(hashMap6));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap7.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform sampler2D blured;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   vec4 blurColor = texture2D(blured, varTexcoord.st, 0.0);   gl_FragColor.rgb = (blurColor.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;}");
        hashMap7.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap7.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "blured", "color"});
        hashMap.put("compositeWithMaskBlurer", Collections.unmodifiableMap(hashMap7));
        HashMap hashMap8 = new HashMap();
        hashMap8.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap8.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D blured;uniform float eraser;uniform float flipy;uniform sampler2D mask;void main (void) {   vec2 uv = vec2(varTexcoord.x, flipy > 0. ? 1. - varTexcoord.y : varTexcoord.y);   vec4 dst = texture2D(texture, uv, 0.0);   vec4 blurColor = texture2D(blured, uv, 0.0);   gl_FragColor = dst.a <= 0. ? vec4(0.) : vec4(blurColor.rgb, 1.) * dst.a;   if (eraser > 0.) {       vec4 maskColor = texture2D(mask, uv, 0.0);       if (maskColor.a > 0.) {           gl_FragColor.rgba *= (1. - maskColor.a);       }   }}");
        hashMap8.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap8.put("uniforms", new String[]{"mvpMatrix", "texture", "blured", "eraser", "mask", "flipy"});
        hashMap.put("videoBlur", Collections.unmodifiableMap(hashMap8));
        HashMap hashMap9 = new HashMap();
        hashMap9.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;attribute float alpha;varying vec2 varTexcoord;varying float varIntensity;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;   varIntensity = alpha;}");
        hashMap9.put("fragment", "precision highp float;varying vec2 varTexcoord;varying float varIntensity;uniform sampler2D texture;void main (void) {   vec4 f = texture2D(texture, varTexcoord.st, 0.0);   gl_FragColor = vec4(f.r * varIntensity, f.g, f.b, 0.0);}");
        hashMap9.put("attributes", new String[]{"inPosition", "inTexcoord", "alpha"});
        hashMap9.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("brushLight", Collections.unmodifiableMap(hashMap9));
        HashMap hashMap10 = new HashMap();
        hashMap10.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap10.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb;   float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0);   vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86);   vec3 finalColor = mix(color.rgb, borderColor, maskColor.g);   finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b);   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;   gl_FragColor.rgb *= gl_FragColor.a;}");
        hashMap10.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap10.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("blitWithMaskLight", Collections.unmodifiableMap(hashMap10));
        HashMap hashMap11 = new HashMap();
        hashMap11.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap11.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main(void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb;   float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0);   vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86);   vec3 finalColor = mix(color.rgb, borderColor, maskColor.g);   finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b);   float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha);   gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha;   gl_FragColor.a = outAlpha;}");
        hashMap11.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap11.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("compositeWithMaskLight", Collections.unmodifiableMap(hashMap11));
        HashMap hashMap12 = new HashMap();
        hashMap12.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap12.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   float outAlpha = dst.a * (1. - srcAlpha);   gl_FragColor.rgb = dst.rgb;   gl_FragColor.a = outAlpha;   gl_FragColor.rgb *= gl_FragColor.a;}");
        hashMap12.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap12.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("blitWithMaskEraser", Collections.unmodifiableMap(hashMap12));
        HashMap hashMap13 = new HashMap();
        hashMap13.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap13.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform vec4 color;void main (void) {   vec4 dst = texture2D(texture, varTexcoord.st, 0.0);   float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a;   gl_FragColor = vec4(dst.rgb, dst.a * (1.0 - srcAlpha));   if (gl_FragColor.a <= 0.) gl_FragColor.rgb = vec3(0.);}");
        hashMap13.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap13.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "color"});
        hashMap.put("compositeWithMaskEraser", Collections.unmodifiableMap(hashMap13));
        HashMap hashMap14 = new HashMap();
        hashMap14.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap14.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;void main (void) {   gl_FragColor = texture2D(texture, varTexcoord.st, 0.0);}");
        hashMap14.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap14.put("uniforms", new String[]{"mvpMatrix", "texture"});
        hashMap.put("nonPremultipliedBlit", Collections.unmodifiableMap(hashMap14));
        HashMap hashMap15 = new HashMap();
        hashMap15.put("vertex", "precision highp float;uniform mat4 mvpMatrix;attribute vec4 inPosition;attribute vec2 inTexcoord;varying vec2 varTexcoord;void main (void) {   gl_Position = mvpMatrix * inPosition;   varTexcoord = inTexcoord;}");
        hashMap15.put("fragment", "precision highp float;varying vec2 varTexcoord;uniform sampler2D texture;uniform sampler2D mask;uniform bool composite;uniform int type;uniform vec4 color;uniform vec2 resolution;uniform vec2 center;uniform vec2 radius;uniform float thickness;uniform float rounding;uniform float rotation;uniform float arrowTriangleLength;uniform vec2 middle;uniform bool fill;uniform bool clear;float sdTriangle( in vec2 p, in vec2 p0, in vec2 p1, in vec2 p2 ) {   vec2 e0 = p1 - p0, e1 = p2 - p1, e2 = p0 - p2, v0 = p - p0, v1 = p - p1, v2 = p - p2;   vec2 pq0 = v0 - e0*clamp( dot(v0,e0)/dot(e0,e0), 0.0, 1.0 ), pq1 = v1 - e1*clamp( dot(v1,e1)/dot(e1,e1), 0.0, 1.0 ), pq2 = v2 - e2*clamp( dot(v2,e2)/dot(e2,e2), 0.0, 1.0 );   float s = e0.x * e2.y - e0.y * e2.x;   vec2 d = min( min( vec2( dot( pq0, pq0 ), s*(v0.x*e0.y-v0.y*e0.x) ),                      vec2( dot( pq1, pq1 ), s*(v1.x*e1.y-v1.y*e1.x) )),                      vec2( dot( pq2, pq2 ), s*(v2.x*e2.y-v2.y*e2.x) ));   return -sqrt(d.x) * sign(d.y);}float sdBezier(vec2 A, vec2 B, vec2 C, vec2 P) {    vec2 a=B-A,b=A-B*2.+C,c=a*2.,d=A-P;    vec3 k=vec3(3.*dot(a,b),2.*dot(a,a)+dot(d,b),dot(d,a))/dot(b,b);    float p=k.y-k.x*k.x/3., p3=p*p*p, q=k.x*(2.*k.x*k.x-9.*k.y)/27.+k.z, D=q*q+4.*p3/27.;    if (D >= 0.) {        float z=sqrt(D);        vec2 x=(vec2(z,-z)-q)/2., uv=sign(x)*pow(abs(x),vec2(1./3.));        float r=clamp(uv.x+uv.y-k.x/3.,0.,1.);        return length(d+(c+b*r)*r);    } else {        float v=acos(-sqrt(-27./p3)*q/2.)/3., m=cos(v), n=sin(v)*1.73205;        vec3 t=clamp(vec3(m+m,-n-m,n-m)*sqrt(-p/3.)-k.x/3.,0.,1.);        return min(min(length(d+(c+b*t.x)*t.x),length(d+(c+b*t.y)*t.y)),length(d+(c+b*t.z)*t.z));    }}vec4 blendOver(vec4 a, vec4 b) {    float alpha = b.a + a.a * (1. - b.a);    if (alpha <= 0.) return vec4(0.);    return vec4((b.rgb * b.a + a.rgb * a.a * (1. - b.a)) / alpha, alpha);}void main (void) {   vec4 dst = clear ? vec4(0.) : texture2D(texture, varTexcoord.st, 0.0);   vec2 p = varTexcoord.st * resolution - center;   float sdf;   vec2 pp = p;   p *= mat2(cos(rotation), -sin(rotation), sin(rotation), cos(rotation));   if (type == 0) {       sdf = length(p) - min(radius.x, radius.y);   } else if (type == 1 || type == 3) {       vec2 q = abs(p) - abs(radius) + rounding;       sdf = min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - rounding;   } else if (type == 2) {       float n = 5.;       float an = 3.141593 / float(n);       vec2  acs = vec2(cos(an), sin(an)), ecs = vec2(cos(1.), sin(1.));       float bn = mod(atan(p.x, -p.y), 2.0 * an) - an;       p = length(p) * vec2(cos(bn), abs(sin(bn)));       p -= min(radius.x, radius.y) * acs;       p += ecs*clamp( -dot(p, ecs), 0.0, min(radius.x, radius.y) * acs.y / ecs.y);       sdf = length(p) * sign(p.x);   } else if (type == 4) {       p += center;       sdf = sdBezier(center, middle, radius, p) - thickness;       vec2 ba = center - middle;       float a = atan(ba.y, ba.x), g = 30. / 180. * 3.14, ar = sin(g) * arrowTriangleLength;       vec2 ac = center + vec2(cos(a),sin(a)) * ar / 2.;       sdf = min(sdf, max(0., sdTriangle(p, ac, ac+vec2(cos(a+3.14-g), sin(a+3.14-g))*ar, ac+vec2(cos(a+3.14+g), sin(a+3.14+g))*ar)));       sdf += thickness;   }   if (type == 3) {       vec2 c = middle-center;       float a = atan(c.x, -c.y), r = min(radius.x, radius.y) / 2.;       float k = rounding/2., bsdf = sdTriangle(pp+center, center-vec2(cos(a),sin(a))*r, center-vec2(cos(a-3.14),sin(a-3.14))*r, middle);       float h = max(k-abs(sdf-bsdf), 0.)/k;       sdf = min(sdf,bsdf)-h*h*h*k*(1.0/6.0);   }   if (fill && sdf < 0.) {       sdf = 0.;   }   vec4 c = vec4(color.rgb, color.a * (1. - clamp((abs(sdf) - thickness), 0., 2.) / 2.));   gl_FragColor = blendOver(dst, c);   if (!composite) {       gl_FragColor.rgb *= gl_FragColor.a;   }}");
        hashMap15.put("attributes", new String[]{"inPosition", "inTexcoord"});
        hashMap15.put("uniforms", new String[]{"mvpMatrix", "texture", "mask", "clear", "color", "type", "color", "resolution", "center", "radius", "thickness", "rounding", "fill", "rotation", "middle", "arrowTriangleLength", "composite"});
        hashMap.put("shape", Collections.unmodifiableMap(hashMap15));
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map<String, Shader> setup() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, Object>> entry : AVAILABLE_SHADERS.entrySet()) {
            Map<String, Object> value = entry.getValue();
            hashMap.put(entry.getKey(), new Shader((String) value.get("vertex"), (String) value.get("fragment"), (String[]) value.get("attributes"), (String[]) value.get("uniforms")));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
